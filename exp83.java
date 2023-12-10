import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class exp83 {
    public static void main(String[] args) {

        try {
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num< 500) 
            {
                throw new CustomException("Number is less than 500");
            }
            
        } catch (CustomException e) {
            System.out.println(e);
        }
        finally{}
    }
}
