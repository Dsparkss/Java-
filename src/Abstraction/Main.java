package Abstraction;

public class Main {
	
	public static void main(String[] args) {
		
		
		Son son = new Son(34);
		son.career();
		son.partner();
		System.out.println("My Age is " + son.age);
		son.hello();
	
		
		Daughter daughter = new Daughter(36);
		daughter.career();
		daughter.partner();
		System.out.println("My age is " +daughter.age);
		Parent.statics();
		
		//Parent parent = new Parent(90);
		
	}

}
