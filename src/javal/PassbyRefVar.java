package javal;

import java.util.Arrays;

public class PassbyRefVar {
	
	public static void main(String[] args) {
		
		int b = 96;
		int a[] = {1,2,3,4,5};
		arr(a);
		System.out.println("Value changed for the array at index 0 " + Arrays.toString(a));
		
		{ //Block Code
			//Anything initialised inside the block cannot be initialised outside the block
			//Anything initialised outside the block can be used inside the block and value can be changed
			b= 100; // value can be changed inside the block
			System.out.println("I am inside the block" + Arrays.toString(a) );
			int c = 90; // cannot be called outside the block // can be initialised outside the block
		}
		
		System.out.println("I am Changed inside the block" + " " + b);
		
		int c = 90;
	}
	//Changing the value of the index
	static void arr(int [] a) {
		a[0] = 99; // passing the value of the reference variable 
					//if you make change to the object via this reference variable same object will be changed
	}

}
