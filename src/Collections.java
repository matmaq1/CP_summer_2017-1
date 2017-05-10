import java.util.*;

/**
 * Created by Mateusz on 19.04.2017.
 */
public class Collections {
    public static void main(String[] args) {
        Collection<Integer> col1 = new ArrayList<Integer>(); //without first Intger accepts ecerything
        col1.add(5);
        List<Integer> list1 = new ArrayList<>();
        list1.add(2344);
        list1.add(432);
        list1.add(432423);
        list1.add(432);

        for(Integer el:list1){
            System.out.println(el);

        }
        Set<String> mySet = new HashSet<>(); //cannot have duplicates
        mySet.add("ajf");
        mySet.add("jadi");
        mySet.add("jfdi");
        mySet.add("ajf");

        for(String st: mySet){
            System.out.println(st);
        }


        list1.remove(2);
        list1.remove(new Integer(2344));             // will only remove first instance
        for(Integer el:list1){
            System.out.println(el);

        }
        List<String> myStrList = new ArrayList<>();
        myStrList.add("kappa");
        myStrList.addAll(mySet);
        System.out.println();
        for(String string:myStrList){
            System.out.println(string);
        }
        if(myStrList.contains("kappa")){
            System.out.println("we kappa now");
        }
        Set<String> mySortedSet = new TreeSet<>();
        mySortedSet.addAll(myStrList);
        System.out.println();
        for(String string: mySortedSet){
            System.out.println(string);
        }
        //map==dictionary from python
    }
}
