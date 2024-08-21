package collections;

import java.util.Comparator;
import java.util.TreeSet;
//Set:-

//Duplicates are not allowed

//Insertion order is not preserved :-alphabetical Order
public class TreeSetEx {
	
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new MyOrder());
		
		ts.add("chandana");
		
		ts.add("susmitha");
		
		ts.add("varun");

		ts.add("srinija");

		ts.add("pen");

		ts.add("object");

		ts.add("apple");
		
		System.out.println(ts);
		
		
	}
}


class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}
	
}
