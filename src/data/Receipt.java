package data;

public class Receipt {
    Client client;

    public Receipt(Client client) {
        this.client = client;
    }

    public void printReceipt(){
        if(client instanceof ClientPremium){
            ClientPremium clientPremium = (ClientPremium) client;
            System.out.println(client.getProduct().getName() +
                    "\tPrice: " + client.getProduct().getPrice() +
                    "\tDiscount: " + clientPremium.getDiscount() +
                    "\tFinalPrice: " + (client.getProduct().getPrice() - (client.getProduct().getPrice()*clientPremium.getDiscount()))
            );
        }else{
            System.out.println(client.getProduct().getName() + "\tPrice: " + client.getProduct().getPrice());
        }
    }
}
