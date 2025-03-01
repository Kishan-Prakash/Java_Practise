package vehicle;

public abstract class Vehicle{
	protected int reg;
	protected String make;
	protected String model; 
	protected double price;
	
	public Vehicle(int reg, String make, String model, double price){
		this.make=make;
		this.model=model;
		this.price=price;
		this.reg=reg;
	}


	abstract double calculateInsurance();

	@Override
    public String toString()
    {
        return "Make "+ make +" model " + model +" price" + price +" reg"+reg;
    }
	
	
}
