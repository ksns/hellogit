package CollectionsInJava;

import java.util.HashMap;
import java.util.Set;

public class HashMapBasic {
	public static void main(String[] args){
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("first", "First Value");
		hm.put("second", "Second Value");
		hm.put("third", "Third Value");
		System.out.println(hm);
		System.out.println("Vlue os second "+hm.get("second"));
		System.out.println("Is Hash map Empty"+hm.isEmpty());
		hm.remove("second");
		System.out.println(hm);
		System.out.println(hm.size());
		Set<String> keys = hm.keySet();
		for(String key:keys){
			System.out.println(key +"="+hm.get(key));
		}
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("s1", "S1value");
		hm2.put("s2", "S2value");
		hm.putAll(hm2);
		System.out.println(hm);
	}
}
