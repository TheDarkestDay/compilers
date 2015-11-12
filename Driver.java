import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Driver {
    public static void main(String args[]) throws Exception {
        String inputFile = args[0];
               
        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        simpleLexer lexer = new simpleLexer(input);
        
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);       
        simpleParser parser = new simpleParser(tokens);
        ParseTree tree = parser.program();
        JFrame frame = new JFrame("Tree view");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.15);
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
                
        input.reset();
        simpleLexer subLexer = new simpleLexer(input);
        String currentToken = "";
        for(Token tok = subLexer.nextToken(); tok.getType() != Token.EOF; tok = subLexer.nextToken()) {
            System.out.print(tok.getText()+" "+tok.getLine()+":"+tok.getCharPositionInLine()+" "+subLexer.getVocabulary().getSymbolicName(tok.getType())+"\n");
        }
        
        AttrVisitor attr = new AttrVisitor();
        attr.visit(tree);
        
        ParseTreeWalker walker = new ParseTreeWalker();
        ScopeListener listener = new ScopeListener();
        walker.walk(listener,tree);
        listener.printScope();
    }
}