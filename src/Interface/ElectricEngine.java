package Interface;

public class ElectricEngine implements Engine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine Start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine Stops");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("Accelerates through Electric");
		
	}

}
