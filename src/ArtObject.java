public class ArtObject extends productForSale{
    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beaut");
        System.out.printf("The price of this piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
