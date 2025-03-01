package Assignment1;

public class Candy extends Dessert {
	
	protected static int candyprice= 100;
	
	public Candy(String dessert, int quantity) {
		super(dessert, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculatePrice() {
		// TODO Auto-generated method stub
		return quantity/1000*candyprice;
	}

	
}
