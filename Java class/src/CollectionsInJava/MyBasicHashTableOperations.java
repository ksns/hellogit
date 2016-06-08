package CollectionsInJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class MyBasicHashTableOperations {
	public static void main(String[] args){
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("one", "First value");
		ht.put("two","Second Value" );
		ht.put("three", "Third value");
		System.out.println(ht);
		System.out.println("Value of two key "+ ht.get("two"));
		System.out.println("Is hashtable empty?"+ ht.isEmpty());
		ht.remove("two");
		System.out.println(ht);
		System.out.println("Size of hash table " + ht.size());
		ht.put("two", "new second value");
		Set<String> keys = ht.keySet();
		for(String key: keys){
			System.out.println("Value of "+key+" is :" + ht.get(key));
		}
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("1", "ooo");
		hm.put("2", "vvv");
		ht.putAll(hm);
		System.out.println(ht);
		System.out.println(ht.containsKey("one"));
		System.out.println(ht.containsValue("First value"));
		Set<String> keys1 = ht.keySet();
		for(String key:keys){
			System.out.println(key);
		}
	}
}
