import java.util.*;
public class ExampleForMap {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Name","Roja");
		hm.put("Place","Tirupati");
		System.out.println(hm);
		System.out.println("....................");
		
		System.out.println(hm.get("Name"));
		
		System.out.println("....................");
		for(Object i:hm.keySet()) {
			System.out.println(i);
		}
		

	}

}
