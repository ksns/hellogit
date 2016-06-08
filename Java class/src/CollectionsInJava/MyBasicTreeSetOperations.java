package CollectionsInJava;

import java.util.TreeSet;

public class MyBasicTreeSetOperations {
	public static void main(String[] args){
		TreeSet t = new TreeSet();
		t.add("a");
		t.add("A");
		t.add("Y");
		System.out.println(t);
		System.out.println(t.contains("A"));
		System.out.println(t.isEmpty());
		t.remove("A");
		System.out.println(t);
		t.clear();
		System.out.println(t);
		
	}
}
