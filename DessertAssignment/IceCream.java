package day4;

class IceCream extends Dessert {
    private static final double PricePerPiece = 20.0;

    public IceCream(int quantity) {
        super("Ice Cream", quantity);
    }

    @Override
    double calculatePrice() {
        return quantity * PricePerPiece;
    }
}