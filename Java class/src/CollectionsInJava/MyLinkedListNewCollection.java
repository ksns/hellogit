package CollectionsInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListNewCollection {
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("JAVVA");
		ll.add("PERL");
		ll.add("FORTON");
		ll.add("KEy");
		System.out.println(ll);
		List<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		ll.addAll(al);
		System.out.println(ll);
		System.out.println(ll.containsAll(al));
		ll.clear();
		System.out.println(ll);
	}
}
