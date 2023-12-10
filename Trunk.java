abstract public class Trunk {
    int type;       //to store rate
    int duration;
    Trunk(int type,int duration)
    {
        this.type=type;
        this.duration=duration;
    }
    abstract void calculate();
    abstract void display_type();
}
class Ordinary extends Trunk{
    Ordinary(int type, int duration)
    {
        super(type,duration);
    }
    void calculate()
    {
        double cal=type*duration;
        System.out.println("The charge is "+cal);
    }
    void display_type()
    {
        System.out.println("Ordinary");
    }
    
}
class Urgent extends Trunk{
    Urgent(int type, int duration)
    {
        super(type,duration);
    }
    void calculate()
    {
        double cal=type*duration;
        System.out.println("The charge is "+cal);
    }
    void display_type()
    {
        System.out.println("Urgent");
    }
    
    
    
}
class Lighting extends Trunk{
    Lighting(int type, int duration)
    {
        super(type,duration);
    }
    void calculate()
    {
        double cal=type*duration;
        System.out.println("The charge is "+cal);
    }
    void display_type()
    {
        System.out.println("Lightning");
    }
    
    
}
class Testing{
    public static void main(String args[])
    {
        Trunk obj1=new Ordinary(3,760);
        obj1.calculate();
        obj1.display_type();
        Trunk obj2=new Urgent(4,500);
        obj2.calculate();
        obj2.display_type();
        Trunk obj3=new Lighting(5,600);
        obj3.calculate();
        obj3.display_type();
    }
}
