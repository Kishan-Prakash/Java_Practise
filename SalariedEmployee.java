package day3;

public class SalariedEmployee extends Employee
{
    protected double basic;

    // public SalariedEmployee(int empid, String name, double basic)
    // {
    //     this.empid = empid;
    //     this.name = name;
    //     this.basic = basic;
    // }

    public SalariedEmployee(int empid, String name, double basic)
    {
        super(empid, name);
        this.basic = basic;
    }

    @Override
    protected double calculateGross()
    {
        double hra = basic*0.4;
        double da = basic*0.15;
        
        return basic + hra + da;
    }

    protected double calculateNet()
    {
        double pf = basic*0.12;
        return this.calculateGross() - pf;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Gross salary = " + this.calculateGross() + ", Net salary = " + this.calculateNet();
    }
}
