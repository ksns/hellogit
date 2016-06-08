package CollectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("JAVA");
		ll.add("PERl");
		ll.add("FORTON");
		ll.add("KEY");
		System.out.println(ll.contains("JAVA"));
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
		Iterator itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		LinkedList<String> ll2 = (LinkedList<String>) ll.clone();
		System.out.println(ll2);
	}
}
