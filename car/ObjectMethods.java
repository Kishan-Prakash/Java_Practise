package vehicle;

public class ObjectMethods 
{
    Car c1 = new Car("Hond", "City" , 150000);
    Car c2 = new Car("Honda", "City", 150000):

    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());

    if(c1.equals(c2))
    {
        System.out.println("Cars are equal");
    }
}
