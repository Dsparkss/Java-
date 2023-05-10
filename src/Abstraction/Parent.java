package Abstraction;

public abstract class Parent {
	
	int age ;
	//Abstract class object cannot be instanziated
	//Abstract static method is not possible
	//Abstract contrucotr is not possible 
	//Normal method and declartion of variables can be done in abstract class
	
	

	public  Parent(int age) {
		this.age = age;
	}
	
	public void hello() {
		System.out.println("I am a method from abstract class");
	}
	
	static void statics() {
		System.out.println("I am a Static method in abstract class");
	}
	abstract void career();
	abstract void partner();

}
