package javal;

public class Shadowing {
	
	static int x = 90; // shadowed at line 12
	
	public static void main(String[] args) {
		
		
		System.out.println(x);
		int x = 80; // the class variable at line 5 will be shadowed
		System.out.println(x);
		fun();
		
		
		
	}
	
	static void fun() {
		System.out.println(x);
	}

}
