package intro;

public class MethodEx1 {
	
	
	
	int value = 34;

	public String displayMsg() { //dynamic-String
		return "Hi everyone!";
	}

	public static void add(int a, int b) {//static-void
		System.out.println("The sum of two integers is:-" + (a + b));
	}

	public static void main(String[] args) {//static-void
		
		add(76, 78);
		
		
		

	}

}
