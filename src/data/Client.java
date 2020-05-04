package data;

public class Client extends  Person{

    private boolean isCompany;

    public Client(String firstName, String lastName) {
        super(firstName, lastName);
        isCompany = false;
    }

    public Client(String firstName, String lastName, String company) {
        super(firstName, lastName, company);
        isCompany = true;
    }

    public Receipt generateReceipt(){
        if(getProduct() == null)
            return null;
        if(isCompany)
            return (new Invoice(this));
        return (new Receipt(this));
    }
}
