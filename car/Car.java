package vehicle;

public class Car
{
    private String make, model;
    private int price;
    public Car(String make, String model, int price)
    {
        super();
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return " Car [make=" + make + ", model =" + model + ", price= " + price + "]";
    }

    @Override
    public boolean equals(Object o)
    {
        Car other = (Car)o;
        if(this.make.equals(other.make) && this.model.equals(other.model) && this.price=other.price)
            return true;
        else
            return false;
    }

    public int hashcode(){
        return 13 + make.hashCode() + model.hashCode() + price;
    }

//     @Override
//     public int hashCode()
//     {
//         return 
//     }
// }
