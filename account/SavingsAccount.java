package account;

public class SavingsAccount extends account
{
    protected static float intrate =  6.5f;
    public SavingsAccount(int accid, String name, double balance, Address address)
    {
        super(accid, balance, address);
    }

    public void calculateInterest()
    {
        double interest = (balance * intrate * 0.25)/100;
        System.out.println("Interest earned : " + interest);
    }
}
