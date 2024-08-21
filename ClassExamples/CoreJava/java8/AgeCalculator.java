package java8;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
	//AgeCalculator
		
		LocalDate birthDate = LocalDate.of(1999, 8, 14);
		
		LocalDate currentDate = LocalDate.now();
		
		Period p = Period.between(birthDate, currentDate);
		
		System.out.printf("your age is :- %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		
		
		
	}

}
