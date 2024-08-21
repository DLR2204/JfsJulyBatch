package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class HashMapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();

		hm.put(100, "chandana");

		hm.put(103, "varun");

		hm.put(101, "srinija");

		hm.put(102, "susmitha");

		System.out.println(hm);
		
		Set<Integer> set = hm.keySet();	
		
//		Iterator itr= set.iterator();
//		
//		while(itr.hasNext()) {
//			int keys=(int) itr.next();
//			
//			System.out.println(keys+ " = " +hm.get(keys));
//		}
		
		for(Integer obj :set) {
			System.out.println(obj + " = " + hm.get(obj));
		}
		

	}

}
