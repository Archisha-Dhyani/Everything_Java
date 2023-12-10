import java.util.Scanner;
class Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        System.out.println("Enter elements of first array");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elements of second array");
        for (int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            c[i]=a[i];
            c[i+5]=b[i];
        }
    
        // bubble sort
        for(int i=0;i<10;i++)
        {
            for (int j=1;j<(10-i);j++)
            {
                if (c[j-1]>c[j])
                {
                    int temp=c[j-1];
                    c[j-1]=c[j];
                    c[j]=temp;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(c[i]);
        }
        
        

    }
}
