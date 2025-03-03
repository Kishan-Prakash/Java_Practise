package day4;

import java.util.ArrayList;

class Cart {
    private ArrayList<Dessert> cartItems = new ArrayList<>();
    private double totalBill = 0;
    private int totalItems = 0;

    public void addToCart(Dessert dessert) {
        cartItems.add(dessert);
        totalBill += dessert.calculatePrice();
        totalItems += dessert.quantity;
        System.out.println(dessert.quantity + " " + dessert.name + "(s) added to cart.");
    }

    public void displayBill() {
        System.out.println("\n--- Final Bill ---");
        for (Dessert item : cartItems) {
            System.out.println(item.quantity + " " + item.name + "(s) - $" + item.calculatePrice());
        }
        System.out.println("Total Items: " + totalItems);
        System.out.println("Total Bill: ₹" + totalBill);
    }
}