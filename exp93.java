class Counter {
    static int c=0;
    synchronized void printCounter(){
     //System.out.println(Thread.currentThread().getName()+" started with intial value:"+c);
   
        System.out.println(Thread.currentThread().getName()+ " "+(++c));
//System.out.println(Thread.currentThread().getName()+" after incrementvalue:"+c);

    }
    
}

class Parent extends Thread{
    Counter c;
    Parent(Counter c)
    {
        this.c=c;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" started with intial value:"+Counter.c);
        
   // System.out.println(Thread.currentThread().getName()+" is running...");
    c.printCounter();
    //System.out.println(Thread.currentThread().getName()+" after incrementvalue:"+Counter.c);
}
    
}
public class exp93 {
    public static void main(String args[]) {
        Counter obj= new Counter();
            Parent t1= new Parent(obj);
            t1.start();
            Parent t2= new Parent(obj);
            t2.start();
            Parent t3= new Parent(obj);
            t3.start();
            
        
        
        }
    
}
