package InterfaceExtends;

public interface A {
	
	//Static interface methods should be always have a body
	//call via the interface name
	
	
		static void greeting() {
			System.out.println("I am a Static method");
		}
		default void fun () {
				System.out.println("I am from A interface");
	}

}
