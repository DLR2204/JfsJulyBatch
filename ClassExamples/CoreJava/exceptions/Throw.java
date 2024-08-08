package exceptions;

public class Throw {
	
	public static void vote(int age) {
		if(age<18) {
			
			throw new StringIndexOutOfBoundsException("you are not eligible");
		}
		else {
			System.out.println("you are eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		vote(12);
	}
}
