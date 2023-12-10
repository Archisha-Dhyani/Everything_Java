import java.util.Scanner;
interface StackInterface {
    public void push(int a);
    public int pop();
    public void display();
}

public class StackClass implements StackInterface {
    int arr[]=new int[5];
    int size=5;
    int top=-1;
    public void push(int a)
    {
        if(top<size-1)
        {
        arr[++top]=a;
        
        }
        else{
            System.out.println("Overflow");
        }
    }
    public int pop()
    {
        if(top==-1)
        {
        return -1;
        }
        else{
            int x=arr[top--];
            return x;
        }
    }
    public void display()
    {
        for(int i = top;i>-1;i--){
            System.out.print(" "+ arr[i]);
          }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackClass obj=new StackClass();
        while(true)
        {
            System.out.println("Enter 1: push , 2: pop , 3: display , 4: exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter element to be pushed");
                int n=sc.nextInt();
                obj.push(n);
                break;
                case 2:
                int i =obj.pop();
                if (i==-1)
                {
                    System.out.println("The stack is empty");
                }
                else
                {
                    System.out.println("THe popped element is : "+i);
                }
                break;
                case 3:
                obj.display();
                break;
                case 4:
                System.exit(0);
            }
        }
        
    }
    
}
