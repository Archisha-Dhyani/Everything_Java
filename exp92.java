// two threads , one for even , one for odd

class Even implements Runnable{
    public void run()
    {
        for(int i=2;i<=10;i=i+2)
        {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
class Odd implements Runnable{
    public void run()
    {
        for(int i=1;i<10;i=i+2)
        {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
public class exp92 {
    public static void main(String args[]) {
        Even R1 = new Even( );
        Thread t1=new Thread(R1,"Thread 1");
        t1.start();
        Odd R2= new Odd();
        Thread t2=new Thread(R2,"Thread 2");
        t2.start();
        }
    
}
