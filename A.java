package p;
public class A {
    int a=30;
    int b=20;
    public void sum(){
        System.out.println("The sum is"+(a+b));
    }
    private void diff(){
        System.out.println("The difference is"+(a-b));
    }
    protected void mul(){
        System.out.println("The product is"+(a*b));
    }
    void rem(){
        System.out.println("The remainder is"+(a%b));
    }
    
}
