package collections;

//(1)It is not fixed in size.

//(2)Lots of utility methods

//(3)stores both homogenous/heterogenous elements.
//List:-
//(1)It is allowing duplicates

//(2)Insertion is storing

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("srinija");
		
		al.add(true);
		
		al.add("susmitha");
		
		al.add(3.14f);
		
		al.add("chandana");
		
		al.add('c');
		
		al.add("varun");
		
		al.add(122);
		
		
		System.out.println(al);
		
		al.add("srinija");
		
		al.add(true);
		
		al.add("susmitha");
		
		al.add(3.14f);
		
		al.add("chandana");
		
		al.add('c');
		
		al.add("varun");
		
		al.add(122);
		
		
		
		System.out.println(al);
	}
}
