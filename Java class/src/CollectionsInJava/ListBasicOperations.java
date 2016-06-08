package CollectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class ListBasicOperations {
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("JAVA");
		ll.add("PERL");
		ll.add(null);
		ll.add("JAVA");
		System.out.println(ll);
		System.out.println("Linked list Empty or not ? " + ll.isEmpty());
		System.out.println("Element is there o r not ? " + ll.contains("PERL"));
		System.out.println("Size of the linked list is " + ll.size());
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
