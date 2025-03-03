package day4;


class Candy extends Dessert {
    private static final double PricePerKg = 12.0;

    public Candy(int quantity) {
        super("Candy", quantity);
    }

    @Override
    double calculatePrice() {
        return quantity * PricePerKg;
    }
}