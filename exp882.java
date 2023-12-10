public class exp882 {

    public static void main(String[] args) {
    

        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);

            if (op2 == 0) {
                System.out.println("Cannot calculate modulus with a divisor of 0.");
            } else {
                int result = op1 % op2;
                System.out.println("Result: " + result);
            }
        } catch (NumberFormatException e) {
            // Catch the exception if the operands are non-numeric
            System.out.println("Error: Operand is non-numeric.");
        }
    }
}