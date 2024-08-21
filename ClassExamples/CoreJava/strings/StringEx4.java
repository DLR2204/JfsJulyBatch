package strings;

public class StringEx4 implements Runnable{

	@Override
	public void run() {
		
		for(int i =0;i<10;i++) {
			System.out.println(i+".hello - run");
		}
	}
	
	public static void main(String[] args) {
		StringEx4 obj = new StringEx4();
		
		Thread thread = new Thread(obj);
		
		thread.start();    //run method calling
		
		for(int i=0;i<10;i++) {
			System.out.println(i+".Hi  -  main");
		}
		
		
	}

}
