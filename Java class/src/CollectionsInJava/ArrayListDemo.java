package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args){
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2, "M");
		l.add("N");
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);
		Collections.swap(l,2,4);
		System.out.println(l);
	}
}
