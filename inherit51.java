//Write a Java program to show that a private member of a super class cannot be accessed from derived classes. 

public class inherit51 {
    int a=20;
    int b=30;
    int c=20;
    private void average()
    {
        double avg=(a+b+c)/3.0;
        System.out.println("The average is"+avg);
    }
    public void disp()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    
}
class base extends inherit51{
    public static void main(String[] args) {
        inherit51 obj=new inherit51();
        obj.disp();
        obj.average();
    }
}