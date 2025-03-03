package vehicle;

public class Fourwheeler extends Vehicle {
	public Fourwheeler(int reg, String make, String model, double price) {
		super(reg, make, model, price);
		// TODO Auto-generated constructor stub
	}



	@Override
	public double calculateInsurance() {
		// TODO Auto-generated method stub
		return 0.1*price;
	}
}
