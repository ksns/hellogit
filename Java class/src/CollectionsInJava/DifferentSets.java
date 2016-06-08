package CollectionsInJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {
	public static void main(String[] args){
		Set s1 = new HashSet();
		MyOwnUtilitiesClass.checkDuplicates(s1, args);
		Set s2 = new TreeSet();
		MyOwnUtilitiesClass.checkDuplicates(s2, args);
		Set s3 = new LinkedHashSet();
		MyOwnUtilitiesClass.checkDuplicates(s3, args);
		
	}
}
