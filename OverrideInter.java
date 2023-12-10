/*Write a program to create an Interface having
 two methods division and modules.
 Create a class, which overrides these methods.

 */

interface Meth{
    public void division(int a, int b);
    default public void modules(int n)
    {
        if(n%2==0)
        {
            System.out.println("The number is even ");
        }
        else{

            System.out.println("The number is odd ");
        }
    }
}
class TryMeth implements Meth{
    public void division(int a,int b)
    {
        double div=(double)(a)/b;
        System.out.println("Division is: "+div);
    }
    public void modules(int n)
    {
        if(n%3==0)
        {
            System.out.println("The number is divisible by 3 ");
        }
        else{

            System.out.println("The number is not divisible by 3 ");
        }
    }

}
public class OverrideInter {
    public static void main(String[] args) {
        TryMeth obj=new TryMeth();
        obj.division(10,2);
        obj.modules(15);
    }
    
}
