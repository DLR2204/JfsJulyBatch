package intro;

public class ConstructorEx1 {
	
	public ConstructorEx1() {
		this("6.chandana");    // ------>constr calling
	}
	public ConstructorEx1(String name) {
		this("9.chandana","Srinija");
		System.out.println(name);
	}
	public ConstructorEx1(String name,String name1) {
		this("13.chandana","Srinija","Susmitha");
		System.out.println(name+"\t"+name1);
	}

	public ConstructorEx1(String name,String name1,String name2) {
		this("18.chandana","Srinija","Susmitha","Varun");
		System.out.println(name+"\t"+name1+"\t"+name2);
	}
	public ConstructorEx1(String name,String name1,String name2,String name3){
		System.out.println(name+"\t"+name1+"\t"+name2+"\t"+name3);
	}
	
	public static void main(String[] args) {
		
		ConstructorEx1 obj = new ConstructorEx1();
	}
}
