import java.util.Scanner;
public class string74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String name = "Archisha Dhyani";
        name=name.toLowerCase();
        System.out.println("Enter element to be searched  ");
        char ch=sc.next().charAt(0);
        int len = name.length();
        String chString = String.valueOf(ch);
        boolean containsch = name.contains(chString);
        int countch = 0;
        
        if (containsch) {
            System.out.println("The string contains "+ch);
            System.out.println("Index of "+ch);
            for (int i = 0; i < len; i++) {
                if (name.charAt(i) == ch) {
                    countch++;
                    System.out.println(i);
                }
            }
        }
        
        System.out.println("Number of occurrences: " + countch);
    }
}
