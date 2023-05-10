package Interface;

//Basically contains  abstract function no body of the function is not allowed
//variables are static and final
//what the class is doing and not how its doing
//abstract class provides the implementation of interface , interface does not provide the implemnetation of abstract class
// Implements by implements keyword
//When the interface has same methods and same name , the interface implementing class will have only one method implemented

// Create different class for different interface
public class Main {
	
	public static void main(String[] args) {
		Car car = new Car() ;
		car.abs();
		car.acc();
		car.normalBrake();
		car.start();
		car.stop();
		car.jbl();
		car.boat();
		car.start();
		
		//Engine eng = new Car();
		//eng.acc();
		
		MediaPlayer med = new Car();
		
		med.start();
		
		System.out.println(Engine.num);
		Media md = new Media ();
		md.start();
		
		
		//Example of passing class name into the constructor
		
		//calling the default constructor
		NiceCar carr = new NiceCar();
		carr.start();
		carr.startmusic();
		carr.upgradeEngine();
		carr.start();
		
		//calling the 2nd constructor
		/*Engine eng = new ElectricEngine();
		NiceCar engine = new NiceCar(eng);
		engine.start();*/
		
		
		
		
	}
	
	
		
		
	
}
