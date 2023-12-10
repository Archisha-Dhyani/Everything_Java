
// thread by extensding thread class
public class exp911 extends Thread{
    
public void run()
{
System.out.println("thread is running...");
}
public static void main(String args[])
{
exp911 t1=new exp911();
t1.start();
}
    
}

