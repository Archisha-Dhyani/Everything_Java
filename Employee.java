public class Employee {
    String name;
    String empid;
    double salary;
    Employee(String name, String empid, double salary)
    {
        this.name=name;
        this.empid=empid;
        this.salary=salary;

    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Employee ID : "+empid);
        System.out.println("Salary : "+salary);
    }
    void inc_sal(double rate){
        salary+=(salary*rate/100);
    }
}
class Manager extends Employee{
    String department;
    Manager(String name, String empid, double salary,String department)
    {
        super(name,empid,salary);
        this.department=department;
    }
    void display()
    {
        super.display();
        System.out.println("The department is: "+department);
    }
    public static void main(String[] args) {
        Employee obj=new Manager("Archisha","500109324",90000,"Technical");
        obj.display();
    }


}
