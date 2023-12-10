//positive , negative and zero in a integer array 
import java.util.Scanner;
class Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter elements");
        int pos=0;
        int neg=0;
        int zero=0;
        for(int m=0;m<10;m++)
        {
        arr[m]=sc.nextInt();
        if(arr[m]>0)
        pos++;
        else if (arr[m]<0)
        neg++;
        else
        zero++;
        }
        System.out.println("Number of positive numbers : "+pos);
        System.out.println("Number of negative numbers : "+neg);
        System.out.println("Number of zeros : "+zero);
    }
}
