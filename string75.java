/*Write a Java code that converts int to Integer, converts Integer to String, 
converts String to int, converts int to String, converts String to Integer converts Integer to int.


 */ 
import java.lang.*;

public class string75 {
    public static void main(String[] args) {
        int a = 10;
        // int to Integer
        Integer aa = Integer.valueOf(a);
        System.out.println(a + " " + aa);
        
        // Integer to String
        String bb = aa.toString();
        System.out.println(aa + " " + bb);
        
        // String to int
        int c = Integer.parseInt(bb);
        System.out.println(bb + " " + c);
        
        // int to String
        String dd = String.valueOf(c);
        System.out.println(c + " " + dd);
        
        // String to Integer
        Integer ee = Integer.valueOf(dd);
        System.out.println(dd + " " + ee);
        
        // Integer to int
        int f = ee.intValue();
        System.out.println(ee + " " + f);
    }
}
