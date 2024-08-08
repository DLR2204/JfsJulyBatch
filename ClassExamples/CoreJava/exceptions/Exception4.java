package exceptions;

class Exception4 {
	public static void main(String args[]) {
		
		try {
			
			int c = 12 / 1;
			
			
			try {
				System.out.println("12.Division");
				int b = 30 / 0;
			} catch (ArithmeticException e) {
				System.out.println("15."+e);
			}
			
			try {
				int a[] = new int[3];
				a[1] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("22.array index problem");
			} 
			
			System.out.println("25.remaing try  statements");
			
		} catch(Exception e) {
			System.out.println("28.handeled");
		}
		System.out.println("30.normal execution..");
	}
}