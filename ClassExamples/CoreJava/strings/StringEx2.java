package strings;

public class StringEx2 {

	public static void main(String[] args) {

		String name = "apple";

		String name1 = "apple";

		System.out.println(name.equals(name1));

		System.out.println(name == name1);

		System.out.println(name.equalsIgnoreCase(name1));

		System.out.println(name.compareTo(name1));
		
		System.out.println("*******************");

		StringBuffer name2 = new StringBuffer("apple");

		StringBuffer name3 = new StringBuffer("apple");

		System.out.println(name2.equals(name3));

		System.out.println(name2 == name3);

		System.out.println(name2.compareTo(name3));

	}

}
