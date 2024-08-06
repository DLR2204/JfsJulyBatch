package oops;

interface Child4 {					//100%
	public void store();

}

abstract class Child3 {				//(0-100) ---50%

	public void store() {
		System.out.println("Secret Code");
	}

	public abstract void pin();
}

public class Child2 {				//0%

	public void store() {
		System.out.println("Secret Code");
	}

}
