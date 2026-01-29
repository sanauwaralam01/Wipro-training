import java.util.*;

public class List_ex {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        ArrayList<String> names1 = new ArrayList<>();
        //ArrayList<Integer> roll_no =new ArrayList<>()
        names1.add("Sanauwar");
        names1.add("Hayat ");
        names1.add("Sanauwar");
        
        names1.add(1, "Shahbaz");
        names1.addFirst("Danish");
        names1.addLast("Aman");
        names1.addAll(names1);
        System.out.println(names1);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(50);
        list1.add(60);
        list1.add(80);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(20);
        list2.add(10);
        list2.add(30);
        list1.addAll(list2);
        list1.addAll(1, list2);
        System.out.println(list1);
        ArrayList<Object>mix =new ArrayList<>();
        mix.add(1);
        mix.add("Delhi");
        mix.add(2);
        mix.add("Kolkata");
        mix.add(3);
        mix.add("Gurgaon");
        mix.addLast("Bye Bye");
        mix.addFirst("Welcome my blogs");
        System.out.println(mix);
        ArrayList<String>list=new ArrayList<>();
        list.add("Hii");
        list.clear();
        System.out.println(list);
        boolean hasHii=list.contains("Hii");
        System.out.println(hasHii);

        }
    
}
