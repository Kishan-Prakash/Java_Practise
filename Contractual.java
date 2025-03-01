package day3;

public class Contractual extends Employee
{
    protected int hrs;
    protected double rate;

    // public SalariedEmployee(int empid, String name, double basic)
    // {
    //     this.empid = empid;
    //     this.name = name;
    //     this.basic = basic;
    // }

    public Contractual(int empid, String name, int hrs, double rate)
    {
        super(empid, name);
        this.hrs = hrs;
        this.rate = rate;
    }

    @Override
    protected double calculateGross()
    {
        return hrs * rate;
    }

    // protected double calculateNet()
    // {
    //     double pf = basic*0.12;
    //     return this.calculateGross() - pf;
    // }

    @Override
    public String toString()
    {
        //return super.toString() + ", Gross salary = " + this.calculateGross + ", Net salary = " + this.calculateNet;

        return super.toString() + ", Net salary = " + this.calculateGross();
    }
}