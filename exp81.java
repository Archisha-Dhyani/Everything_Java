public class exp81 {
    public static void main(String args[])
    {
        String[] names = {"Archisha", "Diksha", "Yash", "Archi", "Navy", "Harshita", "Mahi", "Lakshya", "Tanishka ", "Rishi"};
        int[] rollNumbers = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Name: " + names[i] + ", Roll Number: " + rollNumbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Please check the array size and indices.");
    }
    
}
}
