package Interface;

public class Car implements Engine,MediaPlayer,Brake {
	
	int sum  = 9090;

	@Override
	public void abs() {
		System.out.println("I am Aba stop's at second when applied");
		
	}

	@Override
	public void normalBrake() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		System.out.println("Starts like an normal Engine");
		
	}

	@Override
	public void stop() {
		System.out.println("Stops like an normal Engnie");
		
	}

	@Override
	public void acc() {
		System.out.println("Acceleration is very speed");
		
	}

	@Override
	public void boat() {
		System.out.println("I use Boat media player");
		
	}

	@Override
	public void jbl() {
	
			System.out.println("I use JBL as a media player");
		
	}
	
	

}
