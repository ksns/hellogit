package CollectionsInJava;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListArray {
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		System.out.println(ll);
		String[] arr = new String[ll.size()];
		ll.toArray(arr);
		/*for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);*/
		for(String str:arr){
			System.out.println(str);
		}
		List<String> list = ll.subList(2, 3);
		System.out.println(list);
	}
}
