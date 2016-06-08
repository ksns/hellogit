package CollectionsInJava;

import java.util.ArrayList;

public class MyBasicArrayList {
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C++");
		al.add("C prog");
		System.out.println("Element at index 2 is " + al.get(2));
		System.out.println("IS element java there is arraylist or not " + al.contains("Java"));
		al.add(3, "PERL");
		System.out.println(al);
		System.out.println("Is arraylist empty ?? " + al.isEmpty());
		System.out.println("Object index of element C++ " + al.indexOf("C++"));
		System.out.println("Size of the arraylist " + al.size());
	}
}
