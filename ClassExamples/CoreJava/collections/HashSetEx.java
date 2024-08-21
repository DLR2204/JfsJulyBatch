package collections;
//Set:-

//Duplicates are not allowed

//Insertion order is not preserved :-random order
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("srinija");

		hs.add("susmitha");

		hs.add("chandana");

		hs.add("varun");

//		hs.add(3.14f);
//
//		hs.add('c');
//
//		hs.add(true);
//
//		hs.add(122);

		System.out.println(hs);
		
		for(String obj :hs) {
			System.out.println(obj);
		}
		
		

	}
}
