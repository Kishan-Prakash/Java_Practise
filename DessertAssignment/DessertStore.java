package day4;


import java.util.Scanner;

public class DessertStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n Dessert Store Menu : ");
            System.out.println("To Buy Candy (per kg) press 1");
            System.out.println("To Buy Cookie (per dozen) press 2");
            System.out.println("To Buy Ice Cream (per piece) press 3");
            System.out.println("To Checkout press 4");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 4) {
                cart.displayBill();
                System.out.println("Thank you for shopping!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            switch (choice) {
                case 1:
                    cart.addToCart(new Candy(quantity));
                    break;
                case 2:
                    cart.addToCart(new Cookie(quantity));
                    break;
                case 3:
                    cart.addToCart(new IceCream(quantity));
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}