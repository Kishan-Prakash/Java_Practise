package vehicle;

public class TwoWheeler extends Vehicle{
	public TwoWheeler(int reg, String make, String model, double price) {
		super(reg, make, model, price);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calculateInsurance() {
		// TODO Auto-generated method stub
		return 0.05*price;
	}
}
