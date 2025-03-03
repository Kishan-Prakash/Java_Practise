package vehicle;


public class Policy{
	
	public void calculateInsurance(TwoWheeler t1 )
    {
        System.out.println("Insurance : " + t1.calculateInsurance());
    }
	
	public void calculateInsurance(Fourwheeler t1 )
    {
        System.out.println("Insurance : " + t1.calculateInsurance());
    }
	
//	public void Print() {
//		System.out.println("Insurance : " + t1.calculateInsurance());
//	}
	
	public static void main(String args[]) {
		Policy p1=new Policy();
		TwoWheeler t1= new TwoWheeler(1234,"2008", "Ninja", 1000000);
		Fourwheeler f1= new Fourwheeler(2345,"2018", "Creta", 1100000);
		
		System.out.println(t1);
        p1.calculateInsurance(t1);
        
        System.out.println(f1);
        p1.calculateInsurance(f1);
        
 
	    
	}
}
