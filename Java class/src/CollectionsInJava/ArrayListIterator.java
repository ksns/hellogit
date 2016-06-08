package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("JAVA");
		al.add(null);
		al.add("perl");
		al.add("forton");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
