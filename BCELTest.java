import java.util.*;


public class BCELTest {
    
    public static final int CONST = 12;
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static double greet(int dbl,double br) {
        int flag = 1;
        return dbl*br+3;
    }
    
    public static void main(String[] args) {
        double x = greet(2,3.4);
        HashMap<String, Double> map = new HashMap<String, Double>();
        HashMap<String, String> mapS = new HashMap<String,String>();
        mapS.put("Test","Bleh");
        map.put("Hello",2.1*4+1-x);
        System.out.println(map.get("Hello")*5);
        System.out.println(map.get("Hello"));
        int g = 22;
        int z = 4;
        int v = 8;
        int t = 10;
        int[] arr = new int[10];
        int[] arr2 = new int[25];
        double[] arrDbl = new double[21];
        String[] arrStr = new String[12];
        arr[1] = 15;
        double w = 1.5*arr[1];
        arrDbl[1] = 2.1;
        arrStr[1] = "Blah";
        String word = "Haha";
        System.out.println(6+x*33.4+CONST);
        System.out.println("Hello, world!");
        while(z > 20 || z < 100) {
            z = z + 1;
        }
        System.out.println("Hello, world!");
        System.out.println(CONST);
        
        
        g = scanner.nextInt();
        word = scanner.next();
        arrDbl[1] = scanner.nextDouble();
    }
}