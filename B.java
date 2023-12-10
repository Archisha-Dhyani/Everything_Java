package q;
import p.*;
public class B extends A {
    public static void main(String args[])
    {
        B obj=new B();
        obj.sum();// public 
        obj.mul();// protected
        //obj.rem();// default 
        //obj.diff();// private
        
    }
    
}
