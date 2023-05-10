package Interface;

public class PowerEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Power engine Start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Power engine Stops");
		
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("Accelerates through Power");
		
	}

}
