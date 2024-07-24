package intro;

public class Static {
	
	static int number =  45;   //static global var
	
	int value = 23;				//instance global var

	
	public static void main(String[] args) {
		
		Static obj = new Static();  //object creation
		
		System.out.println(number);
		
		System.out.println(obj.value);
		
		
	}
	
	
	
}
