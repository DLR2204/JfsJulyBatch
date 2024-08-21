package strings;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String value = "hyderabad";
		
		System.out.println(value.concat(" biryani"));
		
		value.concat(" hyderabad");
		
		System.out.println(value);
		
		StringBuffer name = new StringBuffer("Hyderabad ");
		
		System.out.println(name.append(" biryani"));
		
		name.append(" hello");
		
		System.out.println(name);
		
		
	}

}
