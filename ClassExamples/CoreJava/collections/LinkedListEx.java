package collections;

//(1)It is not fixed in size.

//(2)Lots of utility methods

//(3)stores both homogenous/heterogenous elements.
//List:-
//(1)It is allowing duplicates

//(2)Insertion is storing

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("varun");
		
		ll.add("susmitha");
		
		ll.add("srinija");
		
		ll.add("chandana");
		
//		ll.add(234);
//		
//		ll.add(true);
//		
//		ll.add(3.14f);
		
		System.out.println(ll);

	}

}
