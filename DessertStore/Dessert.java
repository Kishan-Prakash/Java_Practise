

package Assignment1;

import java.util.Scanner;

public abstract class Dessert {
	protected String dessert;
	protected int quantity;
	
	public Dessert(String dessert, int quantity) {
		this.dessert=dessert;
		this.quantity=quantity;
		
	}
	

	abstract double calculatePrice();
	
	

}

