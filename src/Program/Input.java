package Program;

import Deal.Deal;
import Party.Party;
import Products.BotinkiProduct;
import Products.FotoProduct;
import Products.ListProducts;
import Products.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Input {

    static Deal input() {
        Map<Product,Integer> products = new HashMap<>();
        Party bayer = inputParty("bayer");
        Party seller = inputParty("seller");
        products.put(inputProduct(),Integer.valueOf(keyboard("quntity")));
        while ("yes".equalsIgnoreCase(keyboard("you want to add product\"yes\" or \"not\"?"))){
            products.put(inputProduct(),Integer.valueOf(keyboard("quntity")));
        }



        return new Deal(bayer, seller, products);
    }

    private static Party inputParty(String s) {
        Party party = new Party();
        String partyName = keyboard(s);
        String partyAdress = keyboard(s + " adress");
        while (keyboard("do you want to add more info about " + s + " \"yes\" or \"not\"?").equalsIgnoreCase("yes")){
            party.addInfo(keyboard("what type of info you want to add"),keyboard("this"));
        }
        party.setName(partyName);
        party.setAdress(partyAdress);
        return party;
    }

    private static Product inputProduct() {
        if("yes".equalsIgnoreCase(keyboard("you want change product? \"yes\" or \"not\""))){
         if(!ListProducts.list.isEmpty()){
             int id =0;
             for(Product pr : ListProducts.list){
                 System.out.println(id + "  " + pr.toString());
             }
             return ListProducts.list.get(Integer.valueOf(keyboard("number")));
         }else{
             System.out.println("sorry, not have products to change");
         }
        }

        String title = keyboard("title");
        String priceStr = keyboard("price");
        String change = keyboard("Change \"foto\" or \"botinki\"?");

        if("foto".equalsIgnoreCase(change)){
            FotoProduct pr = inputFotoProduct();
            pr.setTitle(title);
            pr.setPrice(Double.valueOf(priceStr));
            ListProducts.list.add(pr);
            return pr;
        }else if("botinki".equalsIgnoreCase(change)) {
            BotinkiProduct pr = inputBotinkiProduct();
            pr.setTitle(title);
            pr.setPrice(Double.valueOf(priceStr));
            ListProducts.list.add(pr);
            return pr;
        }else throw new RuntimeException("is unknown product");
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

        String change = keyboard("Change \"digital\" or \"not\"?");
        if("digital".equals(change)){
            pr.setDigital(true);
        }else if("not".equals(change)){
            pr.setDigital(false);
        }else throw new RuntimeException("Mistaeks input");
        String megapxStr = keyboard("megapx");
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
