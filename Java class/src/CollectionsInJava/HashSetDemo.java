package CollectionsInJava;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args){
		HashSet h = new HashSet();
		h.add(10);
		h.add("swathi");
		h.add("java");
		h.add("practise");
		h.add(null);
		System.out.println(h.add("java"));
		System.out.println(h);
	}
}
