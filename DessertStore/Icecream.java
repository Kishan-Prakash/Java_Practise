package Assignment1;

public class Icecream extends Dessert{
	
	protected static int icecreamprice= 120;
	
	public Icecream(String dessert, int quantity) {
		super(dessert, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculatePrice() {
		// TODO Auto-generated method stub
		return quantity*icecreamprice;
	}
	

}
