package vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.

public class DemoClone
{
    public static void main(String[] args throws CloneNotSupportedExeption)
    {
        List<String> colors = new ArrayList<>();
        List<String> copy = new ArrayList<>();
        colors.add("Black");
        colors.add("White");

        NewCar c1 = new NewCar("Mahendra", "XUV", 200000, colors);
        NewCar c2 = c1;

        for(String c : colors)
        {
            copy.add(c);
        }

        NewCar c3 = new NewCar(c1.getMake(), c1.getModel(), c1.getPrice(), copy);
        NewCar c4 = (NewCar)c1.clone();
        c1.setPrice(220000);
        colors.add("Red");

        System.out.println("original : " + c1);
        System.out.println("Shallow copy : " + c2);
        System.out.println("Deep copy : " + c3);
        System.out.println("Clone : " + c4);
    }
}
