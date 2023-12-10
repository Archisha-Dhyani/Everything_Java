/*Write a program that converts all characters of a string in capital letters. 
(Use StringBuffer to store a string). Don’t use inbuilt function.
 
 */
public class string72 {
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("hello");
        for(int i=0;i<str.length();i++)
        {

            str.setCharAt(i,
            (char)((int)str.charAt(i)-32));
        }
        System.out.println(str);

    }
}
