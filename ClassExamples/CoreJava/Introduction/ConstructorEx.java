package intro;

public class ConstructorEx {
	
	public ConstructorEx() {			//default constructor
		System.out.println("6.Iam from the default constructor");
		
	}
	
	public ConstructorEx(String name) {		//Parametrised constr
		System.out.println("11.Iam from the parametrised constr:-" +name);
	}

	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx("apple");
	}
}
