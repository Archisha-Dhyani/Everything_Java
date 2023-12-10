import java.util.Scanner;
class Month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println(arr[n-1]);
    }
}

