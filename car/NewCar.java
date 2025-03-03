package vehicle;

import java.util.ArrayList;
import java.util.List;

import day2.Date;

public class NewCar implements Cloneable
{
    private String make, model;
    private String price;
    private List<String> colors;
    private Date mandate;

    public NewCar( String make, String model, int price, List<String> colors)
    {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colors = colors;

    }

    public String getMake()
    {
        return make:
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public List<String.getColors()
    {
        return colors:
    }

    public void setColors(List<String> colors)
    {
        this.colors = colors;
    }

    @Override
    public String toString()
    {
        return  " NewCar [make=" + make + ", model =" + model + ", price= " + price + ", colors" + colors + "]";
    }

    public Object clone() throws CloneNotSupportedException
    {
        NewCar copy = new NewCar(this.make, this.model, this.price, this.colors)
        copy.colors = new ArrayList<>();
        for(String c : this.colors;
        {
            copy.colors.add(c);
        }

        copy.mandate = new Date(this.mandate.getDay(), this.mandate.getMonth(), this.mandate.getYear());
        return copy;
    }
}
