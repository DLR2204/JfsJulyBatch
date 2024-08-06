package oops;
class Parent4{
	public  void display() {
		System.out.println("Iam from the parent class");
	}
}


public class Child6 extends Parent4{
	

	public static void main(String[] args) {
		
	Child6 obj = new Child6();	
		obj.display();
	}
	
	
	@Override
	public void display() {
		System.out.println("Iam from the child class");
	}
}
