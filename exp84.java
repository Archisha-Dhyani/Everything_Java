
import java.util.Scanner;


class MismatchException extends Exception {
    public MismatchException(String message) {
        super(message);
    }
}

public class exp84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter 'a': ");
            int a = sc.nextInt();
            System.out.print("Enter 'b' : ");
            int b = sc.nextInt();
            
            int result = divide(a, b);
            System.out.println("Result: " + result);
            throw new MismatchException("not integers");
            
        } catch (MismatchException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("'b' cannot be zero.");
        } else {
            return a / b;
        }
    }
}