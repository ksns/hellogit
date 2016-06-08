package CollectionsInJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyBasicHashSet {
	public static void main(String[] args){
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		System.out.println(hs);
		hs.remove("three");
		System.out.println(hs.contains("three"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Set<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		hs.addAll(s);
		System.out.println(hs);
		String[] arr = new String[hs.size()];
		hs.toArray(arr);
		for(String str:arr){
			System.out.println(str);
		}
		hs.retainAll(s);
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
	}
}
