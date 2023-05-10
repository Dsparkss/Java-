package Abstraction;

public class Daughter extends Parent {

	public Daughter(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void career() {
		System.out.println("I am a coder");
		
	}

	@Override
	void partner() {
		System.out.println("I love Doctor");
		
	}

}
