package day4;

abstract class Dessert {
    String name;
    int quantity;

    public Dessert(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    abstract double calculatePrice();
}
