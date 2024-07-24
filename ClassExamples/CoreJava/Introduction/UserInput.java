package intro;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your name :-");
		
		String name = scan.next();
		
		System.out.print("Please enter your id number:-");
		
		int id = scan.nextInt();
		
		System.out.println("Hi "+name +" Welcome to java" );
		
		System.out.println("your id number is :-" +id);
		
		
	}

}
