package exceptions;

public class Exception3 {
	
	public static void main(String args[]) {
		
		try {
			
			int a[] = new int[5];// 0,1,2,3,4
			a[9] = 30/0;
			String s= "hello";
			int x=Integer.parseInt(s,27);
			System.out.println(x);
			System.out.println("14."+s.length());
			System.out.println("15.no error  " + a[2]);
		}	
		catch (ArithmeticException e) {
			System.out.println("18.dont enter zero denominator");}
		catch (ArrayIndexOutOfBoundsException Ae) {
			System.out.println("20.index maximum size crossed");}
		catch (NumberFormatException e) {
		System.out.println("22.unable to convert string to number");}	
		catch(Exception ea)
		{System.out.println("24.not handled"+ea);}
		finally {//it will print in any case
			System.out.println("26.executes every time for closing connections");
			}
		
		System.out.println("29.remaining code  executed...");
		//
	}}