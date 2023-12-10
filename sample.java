public class sample {
    int l,b,h;
    sample(int l,int b,int h)  // to refer instance variable of current class

    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    sample(int l,int b,int h,int n)  // : to invoke current class constructor
    {
        this(l,b,h);  // must be the first statement
        System.out.println("Extra number is "+n);
    }
    void display_vol()
    {
        double volume= l*b*h;
        System.out.println("The volume is "+volume);
    }
    void display() // to invoke current class method
    {
        this.display_vol();
    }
	sample(){}
}

class sample2 extends sample{
    public static void main(String args[])
    {
        sample obj=new sample(10,20,30);
        obj.display_vol();
    }

}
