package InterfaceNested;

public class B implements A.NestedInterface{

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return (num & 1)==1;
	}
	

}
