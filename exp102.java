
import java.util.*;


public class exp102 {
    public static void main(String args[]){
    Map<Integer,String> map=new HashMap<>();
    map.put(10,"Archisha");
    map.put(20,"Diksha");
    map.put(30,"Yash");
        /*
         * •	find whether specified key exists or not.
•	find whether specified value exists or not
•	get all keys from the given HashMap

         */

     //find whether specified key exists or not.

    if(map.containsKey(10)){
        System.out.println("Contains key 10 ");
    }
    else{
        System.out.println("Doesnt contain key 10 ");
    }
    if(map.containsValue("Diksha")){
        System.out.println("Contains value Diksha ");
    }
    else{
        System.out.println("Does not contain value Diksha ");
    }

    

    //Get all keys
	Set<Integer> keys = map.keySet();
    for(Integer key: keys){
        System.out.println(key);
    }
    // print key value pair 
    System.out.println("Print key value pair");
    for(Map.Entry m : map.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
    }
    }
}

