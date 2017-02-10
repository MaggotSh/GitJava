package Program;

import Deal.Deal;
import Party.Party;
import Products.BotinkiProduct;
import Products.FotoProduct;
import Products.Product;

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
        String partyAdress = keyboard(s + " adress");
        Party party = new Party();
        party.setName(partyName);
        party.setAdress(partyAdress);
        return party;
    }

    private static Product inputProduct() {
        String title = keyboard("title");
        String priceStr = keyboard("price");
        String quntityStr = keyboard("quntity");

        String product = keyboard("Change \"foto\" or \"botinki\"");
        if("foto".equals(product)){
            FotoProduct pr = inputFotoProduct();
            pr.setTitle(title);
            pr.setPrice(Double.valueOf(priceStr));
            pr.setQuntity(Integer.valueOf(quntityStr));
            return pr;
        }else if("botinki".equals(product)){
            BotinkiProduct pr = inputBotinkiProduct();
            pr.setTitle(title);
            pr.setPrice(Double.valueOf(priceStr));
            pr.setQuntity(Integer.valueOf(quntityStr));
            return pr;
        }
        return null;
    }

    private static BotinkiProduct inputBotinkiProduct() {
        BotinkiProduct pr = new BotinkiProduct();

        String sizeStr = keyboard("size");
        String color = keyboard("color");
        pr.setSize(Integer.valueOf(sizeStr));
        pr.setColor(color);
        return pr;
    }

    private static FotoProduct inputFotoProduct() {
        FotoProduct pr = new FotoProduct();

        String digitalStr = keyboard("Change \"digital\" or \"not\"");
        if("digital".equals(digitalStr)){
            pr.setDigital(true);
        }else if("not".equals(digitalStr)){
            pr.setDigital(false);
        }
        String megapxStr = keyboard("megaph");
        pr.setMegapx(Integer.valueOf(megapxStr));

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
