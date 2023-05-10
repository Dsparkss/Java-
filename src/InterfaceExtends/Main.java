package InterfaceExtends;

public class Main implements B {

//	@Override
//	//public void fun() {
//		// TODO Auto-generated method stub
//		
//	//}
//
//	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String [] args) {
		
		//Running Methods from A interface directly by giving default Keyword
		Main ma = new Main();
		ma.fun();
		
		//calling static method diredctly from the interface
		A.greeting();
	}

}
