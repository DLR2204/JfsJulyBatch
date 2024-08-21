package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
//Set:-

//Duplicates are not allowed

//Insertion order is preserved :-insertion order

public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add("chandana");

		lhs.add("srinija");

		lhs.add("susmitha");

		lhs.add("varun");

		lhs.add("apple");

		lhs.add(1234);

		System.out.println(lhs);
		
		Iterator itr = lhs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
