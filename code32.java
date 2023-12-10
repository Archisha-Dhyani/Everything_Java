
import java.util.Scanner;
class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[10];
        double sq=0;
        System.out.println("Enter Elements");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<10;i++)
        {
            sq+=arr[i]*arr[i];
        }
        System.out.println(sq);
    }
}
