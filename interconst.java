/*Write a program in Java to show the usefulness of Interfaces 
as a place to keep constant value of the program
 */
interface Change{
    String sap="500109324";
}
class Try implements Change{
    static void trial()
    {
        sap="500109567";
    }

}

public class interconst {
    public static void main(String[] args) {
        Try.trial();
    }
    
}

