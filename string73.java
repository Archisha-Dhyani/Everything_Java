import java.util.Scanner;

public class string73 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String str = sc.nextLine();
        String newst="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            newst+=ch;            
            newst+=(char)((int)ch-32);
        }
        System.out.println(newst);
    }
}
