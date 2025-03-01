package Assignment1;

public class Coockies extends Dessert {
	
	protected static int coockieprice= 100;
	
	public Coockies(String dessert, int quantity) {
		super(dessert, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculatePrice() {
		// TODO Auto-generated method stub
		return quantity/12*coockieprice;
	}

}
