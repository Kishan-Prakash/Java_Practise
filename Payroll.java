package day3;

public class Payroll
{
    public void displayGrross(Employee e)
    {
        System.out.println("Gross salary for the month : " + e.calculateGross());
    }

    public void displayNet(SalariedEmployee se)
    {
        System.out.println("Net Salary for the month : " + se.calculateNet());

    }

    public static void main(String[] args)
    {
        Payroll payroll = new Payroll();

        SalariedEmployee se = new SalariedEmployee(2334,"aaa", 600000 );
        Manager me = new Manager(56485, "bbb", 80000,15000);
        Contractual ce = new Contractual(342, "ccc", 40, 500);

        System.out.println(se);
        payroll.displayGrross(se);
        
        System.out.println(me);
        payroll.displayGrross(me);

        System.out.println(ce);
        payroll.displayGrross(ce);

    }
}
