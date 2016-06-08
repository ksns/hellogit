package CollectionsInJava;

import java.util.ArrayList;

public class ArrayListCopy {
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		System.out.println("Actual array list " + al);
		ArrayList<String> copy = (ArrayList<String>) al.clone();
		System.out.println("Copy array list " + copy);
	}
}
