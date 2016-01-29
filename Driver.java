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
/*import java.io.IOException;
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
    public static void main(String args[]) throws Exception {
        String inputFile = args[0];
               
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
        
        Translator trans = new Translator();
        trans.setScope(listener.getScope());
        walker.walk(trans,tree);
        
            
        String source = trans.getResult();
        
        try(  PrintWriter out = new PrintWriter( "Program.java" )  ){
            out.println( source );
        }
        
        Runtime.getRuntime().exec("javac Program.java");
        
        
        File compiledFile = new File("Program.class");
        
        while (!compiledFile.exists()) {
            
        }
        
        Class.forName("Program").getDeclaredMethod("main", new Class[] { String[].class })
                .invoke(null, new Object[] { null });
    /*    System.out.println(source);
        
        System.setProperty("java.home", "C:\\Program Files\\Java\\jdk1.8.0_60");
        
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(compiler);
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();

        StringWriter writer = new StringWriter();
        PrintWriter out = new PrintWriter(writer);
        out.println(source);
        out.close();
        

        JavaFileObject file = new JavaSourceFromString("Program", writer.toString());
        
        Iterable<? extends JavaFileObject> compilationUnits = Arrays.asList(file);
        CompilationTask task = compiler.getTask(null, null, diagnostics, null, null, compilationUnits);

        boolean success = task.call();
        for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
            System.out.println(diagnostic.getCode());
            System.out.println(diagnostic.getKind());
            System.out.println(diagnostic.getPosition());
            System.out.println(diagnostic.getStartPosition());
            System.out.println(diagnostic.getEndPosition());
            System.out.println(diagnostic.getSource());
            System.out.println(diagnostic.getMessage(null));
        }
        System.out.println("Success: " + success);

        try {
            Class.forName("Program").getDeclaredMethod("main", new Class[] { String[].class })
                .invoke(null, new Object[] { null });
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e);
        } catch (NoSuchMethodException e) {
            System.err.println("No such method: " + e);
        } catch (IllegalAccessException e) {
            System.err.println("Illegal access: " + e);
        } catch (InvocationTargetException e) {
            System.err.println("Invocation target: " + e);
        } */
    }
}

/*class JavaSourceFromString extends SimpleJavaFileObject {
  final String code;

  JavaSourceFromString(String name, String code) {
    super(URI.create("string:///" + name.replace('.','/') + Kind.SOURCE.extension),Kind.SOURCE);
    this.code = code;
  }

  @Override
  public CharSequence getCharContent(boolean ignoreEncodingErrors) {
    return code;
  }
}*/