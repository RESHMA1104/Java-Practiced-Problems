import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> mm = new HashMap<>();
        mm.put(1001, "abc");
        mm.put(1002, "ijk");
        mm.put(1003, "xyz");
        System.out.println(mm);
        // for(int i : mm.keySet()){
        //     System.out.println(i);
        // }
        // for(String i : mm.values()){
        //     System.out.println(i);
        // }
        for(Map.Entry<Integer,String> i : mm.entrySet()){
            System.out.println(i.getKey()+" " +i.getValue()+" "+i);
        }
    }
}