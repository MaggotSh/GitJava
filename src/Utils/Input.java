package Utils;

import Deal.Deal;
import Party.Party;
import Products.BotinkiProduct;
import Products.FotoProduct;
import Products.Product;
import static Utils.Utils.*;
import java.util.HashMap;
import java.util.Map;

public class Input {

    public static Deal input() {
        Map<Product,Integer> products = new HashMap<>();
        Party bayer = inputParty("bayer");
        Party seller = inputParty("seller");
        do {
            products.put(changeProduct(), Integer.valueOf(keyboard("quntity")));
            System.out.println("you want to add product");
        }while (isChangedFirst("yes", "not"));

        return new Deal(bayer, seller, products);
    }

    private static Party inputParty(String partyType) {
        Party party = new Party();
        String partyName = keyboard(partyType);
        String partyAdress = keyboard(partyType + " adress");
        System.out.println("do you want to add more info about " + partyType);
        while (isChangedFirst("yes", "not")){
            party.addInfo(keyboard("what type of info you want to add"),keyboard("this"));
        }
        party.setName(partyName);
        party.setAdress(partyAdress);
        return party;
    }

    private static Product changeProduct() {
        System.out.println("you want change product");
        if(isChangedFirst("yes", "not")){
            if(!Product.allProducts.isEmpty()){
                int id =0;
                System.out.println("___________________________________________");
                for(Product pr : Product.allProducts){
                     System.out.println(id + "  " + pr.toString());
                 }
                 return Product.allProducts.get(Integer.valueOf(keyboard("number")));
             }else{
                System.out.println("sorry, not have products to change");
            }
        }
        if(isChangedFirst("foto", "botinki")){
            return inputFotoProduct();
        }else {
            return inputBotinkiProduct();
        }
    }

    private static BotinkiProduct inputBotinkiProduct() {
        BotinkiProduct pr = new BotinkiProduct();
        inputUniProperty(pr);
        String sizeStr = keyboard("size");
        String color = keyboard("color");
        pr.setSize(Integer.valueOf(sizeStr));
        pr.setColor(color);
        Product.allProducts.add(pr);
        return pr;
    }

    private static void inputUniProperty(Product pr) {
        String title = keyboard("title");
        String priceStr = keyboard("price");
        pr.setTitle(title);
        pr.setPrice(Double.valueOf(priceStr));
    }

    private static FotoProduct inputFotoProduct() {
        FotoProduct pr = new FotoProduct();
        inputUniProperty(pr);
        if(isChangedFirst("digital", "not")){
            pr.setDigital(true);
        }else{
            pr.setDigital(false);
        }
        String megapxStr = keyboard("megapx");
        pr.setMegapx(Integer.valueOf(megapxStr));
        Product.allProducts.add(pr);
        return pr;
    }
}
