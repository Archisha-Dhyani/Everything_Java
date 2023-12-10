abstract public class Worker {
    String name;
    double rate;
    Worker(String name, double rate)
    {
        this.name=name;
        this.rate=rate;
    }
    abstract double ComPay(int hours);
}
class DailyWorker extends Worker
{
    DailyWorker(String name, double rate)
    {
        super(name,rate);
    }
    double ComPay(int hours)
    {
        double sal=(hours/8)*rate;
        return sal;
    }
}
class SalariedWorker extends Worker
{
    SalariedWorker(String name, double rate)
    {
        super(name,rate);
    }
    double ComPay(int hours)
    {
        double sal=40*rate;
        return sal;
    }
}
class Tester{
    public static void main(String[] args) {
    Worker obj1 =new DailyWorker("Vijay",4.5);
    System.out.println("The weekly salary is"+obj1.ComPay(65));
    Worker obj2 =new SalariedWorker("Sanjay",5.0);
    System.out.println("The weekly salary is"+obj2.ComPay(65));
        
    }
    

}