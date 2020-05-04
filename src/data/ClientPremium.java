package data;

public class ClientPremium  extends  Client{

    private double discount = 0.1;

    public ClientPremium(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public ClientPremium(String firstName, String lastName, String company) {
        super(firstName, lastName, company);
    }

    public double getDiscount() {
        return discount;
    }
}
