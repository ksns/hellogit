package CollectionsInJava;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListNewCollection {
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("second");
		al.add("three");
		al.add("Random");
		al.add("number");
		System.out.println(al);
		/*List<String> list = new ArrayList<String>();
		list.add("second");
		list.add("Random");
		al.addAll(list);
		System.out.println(al);
		//al.clear();
		//System.out.println(al);
		System.out.println(al.containsAll(list));*/
		/*String[] arr = new String[al.size()];
		al.toArray(arr);
		for(String str:arr)
			System.out.println(str);*/
		List<String> list = al.subList(2, 4);
		System.out.println(list);
	}
}
