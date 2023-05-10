package javal;

public class PassByValue {
	
	public static void main(String [] args) {
		//trying to swap the variables 
		//Primitve data types passes by value #int , string, char 
		//object passes by value of the reference variable 
		
		// SwAPPING OF TWO NUMBERS
		
		int d = 90;
		int e= 36;
		int temp;
		 temp = d;
		 d=e;
		 e=temp;
		 System.out.println("Printing the fvalue of Shifted numbers " +"Value of d = " + d + " " + "Value of e = " + e );
		
		
		
		String name = "Dinesh";
		change(name);
		System.out.println(name);
		
		
		// Swapping of two numbers using java methods // passes by value 
		int a = 26;
		int b = 32;
		num(a,b);
		System.out.println(a + " " + b); // object doesnt get swapped
		
		
	}

	static void change(String nam) {
		nam = "Sathish";  //creating a new object
	}
	
	static void num (int a , int b) {
		
		int temp = a;
			a=b;
			b =temp ;
			System.out.println("Swappign inside the method" + a + " " +b);
		
	}
}
