package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args){
		Collection c1 = new ArrayList();
		System.out.println(c1.isEmpty());
		c1.add("swathi");
		c1.add("prasad");
		c1.add("JAva");
		System.out.println(c1.isEmpty());
		Iterator itr = c1.iterator();
		while (itr.hasNext()){
			String value = (String) itr.next();
			System.out.println(value);
			if(value.equals("prasad")){
				itr.remove();
			}
		}
		for (Object obj:c1){
			System.out.println(obj);
		}
	}
}
