package flowcontrol;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter your max marks:-");

		float mm = scan.nextFloat();

		System.out.print("Please enter your obtained marks:-");

		float om = scan.nextFloat();

		float percentage = (om / mm) * 100;

		System.out.println("your percentage is :- " + percentage);

		// Grade Calculator
		int gpa = (int) (percentage / 10);

		String grade;

		System.out.println("your gpa is :-" + gpa);

		switch (gpa) {
		case 9: {
			grade = "outstanding";
			break;
		}

		case 8: {
			grade = "very good";
			break;
		}
		case 7: {
			grade = "good";
			break;
		}
		case 6: {
			grade = "average";
			break;
		}
		case 5: {
			grade = "poor";
			break;
		}
		case 4: {
			grade = "very poor";
			break;
		}
		default: {
			grade = "Fail";
			break;
		}

		}

		System.out.print("your grade is :-" + grade);

	}

}
