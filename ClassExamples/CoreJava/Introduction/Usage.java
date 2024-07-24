package intro;

public class Usage {
	
	static String nationality = "Indian";
	
	int aadhar;
	
	
	
	public static void main(String[] args) {
		
		Usage varun = new Usage();
		
		Usage srinija = new Usage();
		
		Usage susmitha = new Usage();
		
		varun.aadhar = 1;
		
		srinija.aadhar = 2;
		
		susmitha.aadhar = 3;
		
		System.out.println("varun :- " + nationality +"\t"+ varun.aadhar);
		
		System.out.println("srinija :- " + nationality +"\t"+ srinija.aadhar);
		
		System.out.println("susmitha :- " + nationality +"\t"+ susmitha.aadhar);
		
	}
	

}
