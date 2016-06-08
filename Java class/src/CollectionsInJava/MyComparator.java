package CollectionsInJava;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary() < e2.getSalary()){
			return 1;
		} else {
			return -1;
		}
	
	}

}
