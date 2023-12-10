import java.util.*;

public class exp104 {
    Map<Integer,ArrayList> map=new HashMap<>();
    void addStudent(int sapId, String name, int age, double cgpa){
        ArrayList<Object> list=new ArrayList<>();
        list.add(name);
        list.add(age);
        list.add(cgpa);
        map.put(sapId,list);
    }

    void removeStudent(int sapId){
        map.remove(sapId);
        System.out.println("Student removed ");
    }
    void getStudentDetails(int sapId) {
        System.out.println(map.get(sapId));
    }
    void viewAllStudents(){
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    public static void main(String[] args) {
        //Map<Integer,ArrayList> map=new HashMap<>();
        exp104 obj= new exp104();

        obj.addStudent(500,"Archisha",19, 8.9);
        obj.addStudent(600,"Diksha",19, 9.0);
        obj.addStudent(700,"Yash",20, 8.9);
        obj.getStudentDetails(500);
        obj.viewAllStudents();
        obj.removeStudent(700);
        obj.viewAllStudents();

        
    }
    
}
