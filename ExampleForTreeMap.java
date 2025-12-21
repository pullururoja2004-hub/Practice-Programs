import java.util.*;
import java.util.TreeMap;
public class ExampleForTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Object> tm=new TreeMap<String,Object>();
        tm.put("Name","roja");
        tm.put("age",22);
        tm.put("email","roja@18092004");
        System.out.println(tm);
        for(Object obj:tm.keySet()){
            System.out.println(obj);
        }
        System.out.println("----------------------");
        for(Object obj:tm.entrySet()){
            System.out.println(obj);
        }
    }
}
