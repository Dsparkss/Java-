package javal;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		
		
		fun("dinesh " , " babu", " NI" ,"VE");
		

	}
	
	//static void multiple(int a , int b , String ...name) {
		//System.out.println(Arrays.deepToString(name ));
	//}
	
	
	static void fun(String ...name) {
		
		System.out.println(Arrays.toString(name ));
		
	}

}
