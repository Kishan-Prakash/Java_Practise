package day4;

class Cookie extends Dessert {
    private static final double PricePerDozen = 7.0;

    public Cookie(int quantity) {
        super("Cookie", quantity);
    }

    @Override
    double calculatePrice() {
        return (quantity / 12.0) * PricePerDozen;
    }
}