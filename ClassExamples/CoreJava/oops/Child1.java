package oops;

interface Parent1 {

	public int add(int a, int b);

}

interface Parent2 {

	public int add(int a, int b);
}

public class Child1 implements Parent1, Parent2 {

	@Override
	public int add(int a, int b) {
		
		return (a+b);
	}

}
