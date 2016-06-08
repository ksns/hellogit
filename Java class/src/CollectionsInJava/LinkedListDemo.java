package CollectionsInJava;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		l.add("durga");
		l.add(10);
		l.add(null);
		l.add("durga");
		l.set(0, "software");
		l.add(0, "adhi");
		l.removeFirst();
		l.addLast("last");
		System.out.println(l);
	}
}
