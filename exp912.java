//using runnable interface

public class exp912 implements Runnable {
    
public void run(){
System.out.println("thread is running...");
}
public static void main(String args[]){
exp912 ob=new exp912();
Thread t1 =new Thread(ob); 
t1.start();
}
}

