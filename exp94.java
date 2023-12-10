class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority: " + Thread.currentThread().getPriority());
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " Exiting " );
    }
}

public class exp94 {
    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new MyThread();
            threads[i].setPriority(Thread.MIN_PRIORITY + i); 
        }
        for (int i = 0; i < 5; i++) {
            threads[i].start();
        }

        threads[3].interrupt(); 
        threads[4].interrupt(); 
        for (int i = 0; i < 5; i++) {
            if (threads[i].isAlive()) {
                System.out.println(threads[i].getName() + " is alive.");
                
            } else {
                System.out.println(threads[i].getName() + " is not alive.");
            }
        }

        
    }
    
}



