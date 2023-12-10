import java.util.*;

public class exp101 {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        // read through iterator
        //Traversing list through Iterator
        System.out.println("Read through iterator");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
        }

        // create duplicate objects of arrayList elements 
        ArrayList<Integer> listDup = new ArrayList<Integer>();
        listDup.addAll(list);
        System.out.println("Elemenets copied form one list to another");
        Iterator itr2=listDup.iterator();
        while(itr2.hasNext()){
        System.out.println(itr2.next());
        }

        // Reverse ArrayList content.
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(int i=list.size()-1; i >=0; i--) {
            int ele = list.get(i);
            list3.add(ele);
            }
        System.out.println("Reversed elements stored in another arraylist");
        Iterator itr3=list3.iterator();
        while(itr3.hasNext()){
        System.out.println(itr3.next());
        }

        

    }
}


