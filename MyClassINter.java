/*Write a program to create interface A, in this interface we have two method meth1 and meth2.
 Implements this interface in another class named MyClass.
 */
interface A{
    public void meth1(int a);
    default int meth2(int n)
    {
        int dub=n+n;
        return dub;
    }
}
class MyClass implements A {
    public void meth1(int a)
    {
        double factorial=1;
        for(int i=1;i<=a;i++)
        {
            factorial*=i;
        }
        System.out.println("The factorial is : "+factorial);
    }
    
}
public class MyClassINter{
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.meth1(5);
        System.out.println(obj.meth2(10));
    }
}
