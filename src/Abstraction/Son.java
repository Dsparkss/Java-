package Abstraction;

public class Son extends Parent{
	
	public Son(int age) {
		
		super (age);
		
	}

	@Override
	void career() {
		
		System.out.println("I am an doctor");
		
	}

	@Override
	void partner() {
		
		System.out.println("I Love Actor");
		
	}

}
