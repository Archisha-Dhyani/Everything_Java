//Write a program to make a package Balance. This has an Account class with Display_Balance method.
package Balance;
public class Account{
    public void Display(int cp, int sp){
        int balance=sp-cp;
        System.out.println("The balance is "+balance);
    }
}