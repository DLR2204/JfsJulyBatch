package intro;

public class Instance {
	
	static int staticCounter;  //static global var
	
	int instanceCounter;		//instance globl var
	
	public void counter() {
		
		staticCounter++;
		instanceCounter++;
		
	}
	public void display() {
		
		System.out.println("Static Counter:- "+staticCounter);
		
		System.out.println("Instance Counter:- "+instanceCounter);
	}
	
	public static void main(String[] args) {
		
		Instance obj1 = new Instance();
		
		Instance obj2 = new Instance();
		
		Instance obj3 = new Instance();
		
		
		obj1.counter();
		
		obj2.counter();
		
		obj3.counter();
		
		obj3.display();
		
		
		
	}
	
	

}
