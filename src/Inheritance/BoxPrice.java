package Inheritance;

public class BoxPrice extends BoxWeight{
	
	double cost ;
	
	public BoxPrice() {
		this.cost = 2;
		
	}
	
	public BoxPrice(BoxPrice other) {
	
		this.cost = other.cost;
	}
	
	public BoxPrice(double l, double h, double w ,double weight, double cost) {
		
		super (l,h,w,weight);
		this.cost = cost;
	}
	
	public BoxPrice(double side, double weight,double cost) {
		super(side,weight);
		this.cost = cost;
		
	}

}
