package Assignment1;

import java.util.Scanner;


public class Store {
	
	public void calculatePrice(Candy c1) {
		System.out.println("Candy price:"+c1.calculatePrice());
	}
	
	public void calculatePrice(Coockies ck1) {
		System.out.println("Candy price:"+ck1.calculatePrice());
	}
	
	public void calculatePrice(Icecream i1) {
		System.out.println("Candy price:"+i1.calculatePrice());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store s1=new Store();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dessert(candy icecream,coockies)");
		String item =sc.next();
		
		switch(item) {
		case "candy":
			System.out.println("Enter Amount:");
			int qy=sc.nextInt();
			Candy c1=new Candy("candy",qy);
			System.out.println(c1.calculatePrice());
			
			break;
			
		case "coockies":
			System.out.println("Enter Amount:");
			int qy1=sc.nextInt();
			Coockies ck1=new Coockies(item,qy1);
			System.out.println(ck1.calculatePrice());
			break;
			
		case "icecream":
			System.out.println("Enter Amount:");
			int qy2=sc.nextInt();
			Icecream i1=new Icecream(item,qy2);
			System.out.println(i1.calculatePrice());
			break;
		}
		

	}

}
