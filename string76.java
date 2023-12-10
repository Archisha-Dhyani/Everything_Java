/*
 Write a Java code that converts float to Float converts Float to String converts 
 String to float converts float to String converts String to Float converts Float to float.
 */

import java.lang.*;

public class string76 {
    public static void main(String[] args) {
        float aa = 10.5f;
        
        // float to Float
        Float bb = Float.valueOf(aa);
        System.out.println(aa + " " + bb);
        
        // Float to String
        String cc = bb.toString();
        System.out.println(bb + " " + cc);
        
        // String to float
        float aaParsed = Float.parseFloat(cc);
        System.out.println(cc + " " + aaParsed);
        
        // float to String
        String bbString = String.valueOf(aaParsed);
        System.out.println(aaParsed + " " + bbString);
        
        // String to Float
        Float ccParsed = Float.valueOf(bbString);
        System.out.println(bbString + " " + ccParsed);
        
        // Float to float
        float ccConverted = ccParsed.floatValue();
        System.out.println(ccParsed + " " + ccConverted);
    }
}
