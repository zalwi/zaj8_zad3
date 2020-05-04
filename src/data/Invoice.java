package data;

public class Invoice extends  Receipt {

    public Invoice(Client client) {
        super(client);
    }

    @Override
    public void printReceipt(){
        System.out.println("Invoice: " + client.getFirstName() + " " + client.getLastName() +
                            " / " + client.getCompany());
        super.printReceipt();
    }
}