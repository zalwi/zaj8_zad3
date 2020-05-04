import data.Client;
import data.ClientPremium;
import data.Product;

public class Shop {

    public static void main(String[] args) {
        Client          client1 = new Client("Kamil", "Zalwert");
        Client          client2 = new Client("Jan", "Kowalski", "Złota Firma");
        ClientPremium   client3 = new ClientPremium("Paweł", "Pierwszy");
        ClientPremium   client4 = new ClientPremium("Adam", "Drugi", "Lepsza Firma");

        Product product1 = new Product("Dama", 11_000);
        Product product2 = new Product("Pierożki", 5_000);
        Product product3 = new Product("Słoneczniki", 3_000);
        Product product4 = new Product("Kwadrat", 10_000);

        client1.setProduct(product1);
        client2.setProduct(product2);
        client3.setProduct(product3);
        client4.setProduct(product4);

        System.out.println("---");
        client1.generateReceipt().printReceipt();
        System.out.println("---");
        client2.generateReceipt().printReceipt();
        System.out.println("---");
        client3.generateReceipt().printReceipt();
        System.out.println("---");
        client4.generateReceipt().printReceipt();
        System.out.println("---");
    }
}
