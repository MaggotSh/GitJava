package Program;

import Deal.Deal;
import Party.Party;
import Product.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Input {

    static Deal input() {
        Party bayer = inputParty("bayer");
        Party seller = inputParty("seller");

        Product p1 = inputProduct();
        Product p2 = inputProduct();
        Product p3 = inputProduct();
        Product[] products = new Product[]{p1, p2, p3};

        return new Deal(bayer, seller, products);
    }

    private static Party inputParty(String s) {
        String partyName = keyboard(s);
        Party party = new Party();
        party.setName(partyName);
        return party;
    }

    private static Product inputProduct() {
        String title = keyboard("title");
        String priceStr = keyboard("price");
        String quntityStr = keyboard("quntity");

        Product pr = new Product();
        pr.setTitle(title);
        pr.setPrice(Double.valueOf(priceStr));
        pr.setQuntity(Integer.valueOf(quntityStr));

        return pr;
    }

    private static String keyboard(String message) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("write " + message + ": ");
        String rez = null;
        try {
            rez = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rez;
    }
}
