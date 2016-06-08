package CollectionsInJava;

import java.util.Hashtable;
import java.util.Set;

public class MyHashtableDupEntry {
	public static void main(String a[]){
		 
        Hashtable<Empl,String> tm = new Hashtable<Empl, String>();
        tm.put(new Empl(134,"Ram",3000), "RAM");
        tm.put(new Empl(235,"John",6000), "JOHN");
        tm.put(new Empl(876,"Crish",2000), "CRISH");
        tm.put(new Empl(512,"Tom",2400), "TOM");
        System.out.println("Adding duplicate entry:");
        tm.put(new Empl(512,"Tom",2400), "TOM");
        System.out.println("Hashtable entries:");
        Set<Empl> keys = tm.keySet();
        for(Empl key:keys){
            System.out.println(key+" ==> "+tm.get(key));
        }
        System.out.println("Duplicate got eliminated!!!");
    }

}
