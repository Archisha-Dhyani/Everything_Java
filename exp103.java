import java.util.*;

public class exp103 {
    
    public static void main(String args[]){
    //Creating HashSet and adding elements
    Set<String> set=new HashSet();
    set.add("Dehradun");
    set.add("Delhi");
    set.add("Mumbai");
    set.add("Banglore");
    set.add("Pune");
    // Copy
    System.out.println("elements copied");
    Set<String> hashSet = new HashSet<>(set);
    System.out.println("Copied HashSet: " + hashSet);

    // contains
    System.out.println(set.contains("Pune"));

    // remove all elements 
    System.out.println("Elements removed");
    set.clear();
    System.out.println(set);
    }
    


}
