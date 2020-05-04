import data.Client;
import data.ClientPremium;
import data.Product;

public class Shop {

    public static void main(String[] args) {
        Client[] clients = {new Client("Kamil", "Zalwert"),
                            new Client("Jan", "Kowalski", "Złota Firma"),
                            new ClientPremium("Paweł", "Pierwszy"),
                            new ClientPremium("Adam", "Drugi", "Lepsza Firma")};

        Product[] products = {new Product("Dama", 11_000),
                            new Product("Pierożki", 5_000),
                            new Product("Słoneczniki", 3_000),
                            new Product("Kwadrat", 10_000)};

        //Sprzedaj produkty klientom i wygeneruj rachunek
        for(int i=0; i<clients.length; i++) {
            clients[i].setProduct(products[i]);
            clients[i].generateReceipt().printReceipt();
            System.out.println("---");
        }
    }
}
