package curtain;

import java.util.Scanner;

public class Controller {
	public static void main(String args[]) {
		Operate o1 = new Operate();
		Scanner sc = new Scanner(System.in);
		Boolean toggle1 = false;
		Curtain c1 = new Curtain(false);
		Boolean status = false;
		System.out.println("Curtain is "+ c1.getStatus());
		
		if(c1.status==false) {
			System.out.println("Do you want to open:");
			toggle1=sc.nextBoolean();
			if(toggle1){
				o1.toggle(c1);
				System.out.println("Curtain is "+ c1.getStatus());
			}
		}
		
		
		
	}

}
