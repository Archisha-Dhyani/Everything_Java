import java.util.Scanner;

public class exp85 {
    public int power(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("a and b should not be negative.");
        } else if (a == 0 && b == 0) {
            throw new Exception("a and b should not be zero.");
        } else {
            return (int) Math.pow(a, b);
        }
    }

    public static void main(String[] args) {
        exp85 cal = new exp85();
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = cal.power(a, b);
            System.out.println(a + " ^ " + b + " = " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}