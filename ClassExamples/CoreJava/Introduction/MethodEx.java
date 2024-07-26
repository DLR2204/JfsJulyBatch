package intro;

public class MethodEx {

	public int add(int a, int b) {  //dynamic-int

		System.out.println(a+b);
		return (a + b);
	}
	
	public void displayHi() {  //dynamic-void
		System.out.println("What the hell is the matter with this java class!!!");
	}
	
	public static void main(String []args) { //static-void
		 
		MethodEx obj = new MethodEx();
		
		obj.displayHi();
		
		obj.add(45, 45);
	}
	
	

}
