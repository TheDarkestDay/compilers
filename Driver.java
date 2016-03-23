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
import javax.tools.*;
import java.io.PrintWriter;
import java.io.File;

/*import org.objectweb.asm.Attribute;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Arrays;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject.Kind; */


public class Driver {
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]) throws Exception {
        String inputFile = args[0];
        
        scanner.nextInt();
               
        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        simpleLexer lexer = new simpleLexer(input);
        
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);       
        simpleParser parser = new simpleParser(tokens);
        ParseTree tree = parser.program();
     /*   JFrame frame = new JFrame("Tree view");
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
        } */
        
        
        ParseTreeWalker walker = new ParseTreeWalker();
        ScopeListener listener = new ScopeListener();
        walker.walk(listener,tree);
    //    listener.printScope();
        
        BytecodeWriter trans = new BytecodeWriter(listener.getScope());
  //      trans.setScope(listener.getScope());
        walker.walk(trans,tree);
        
        trans.writeClass();
    }
}
