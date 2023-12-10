
/*Write a program for searching strings for the first occurrence of a character or substring
 and for the last occurrence of a character or substring. 
 */
public class string71 {
    public static void main(String[] args) {
        String str=" Hi my name is Archisha";
        int first=str.indexOf('m');
        int last=str.lastIndexOf("is");
        System.out.println("The first index of m is "+first);
        System.out.println("The last index of 'is' is "+last);
        }
    
}


