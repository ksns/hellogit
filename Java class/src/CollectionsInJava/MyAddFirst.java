package CollectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class MyAddFirst {
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		list.addFirst("first1");
		System.out.println(list);
		list.offerFirst("first2");
		System.out.println(list);
		list.addLast("last");
		System.out.println(list);
		list.offerLast("last1");
		System.out.println(list);
		list.offer("last2");
		System.out.println(list);
		System.out.println(list.element());
		System.out.println(list.getFirst());
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.getLast());
		System.out.println(list.peekLast());
		System.out.println(list);
		Iterator<String> itr = list.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		list.push("again");
		System.out.println(list);
		list.pop();
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.remove("last");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeFirstOccurrence("four");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.removeLastOccurrence("three");
		System.out.println(list);
		
	}
}
