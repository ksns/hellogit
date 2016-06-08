package CollectionsInJava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args){
		Vector v = new Vector();
		for(int i=0; i<10; i++){
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration en = v.elements();
		while (en.hasMoreElements()){
			Integer j = (Integer) en.nextElement();
			if(j%2==0)
				System.out.println(j);
		}
		System.out.println(v);
	}
}
