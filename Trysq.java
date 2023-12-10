/*Write a program to create interface named test. In this interface the member function is square.
 Implement this interface in arithmetic class. Create one new class called ToTestInt. 
 In this class use the object of arithmetic class.
*/
interface test{
    public void square(int a);
}

class ToTestInt implements test
{
    public void square(int a)
    {
        System.out.println("The area of square is: "+(a*a));
    }
}
public class Trysq{
    public static void main(String[] args) {
        ToTestInt obj=new ToTestInt();
	obj.square(5);

    }
}