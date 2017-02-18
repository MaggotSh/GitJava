package Program;

import Products.Product;
import java.util.Date;
import java.util.Map;

public class Deal {

    private Date date;
    private Party bayer;
    private Party seller;
    private Map<Product,Integer> products;

    public Deal (Party bayer, Party seller, Map<Product,Integer> products){

        date = new Date();
        this.bayer = bayer;
        this.seller = seller;
        this.products = products;
    }

    public Date getDate() {
        return date;
    }
    public Party getBayer() {
        return bayer;
    }
    public Party getSeller() {
        return seller;
    }
    public Map<Product,Integer>  getProducts() {
        return products;
    }

    public double getSum(){
        double rez = 0;
        for(Map.Entry<Product,Integer> entry : products.entrySet()){
            rez += entry.getKey().getCost(entry.getValue());
        }
        return rez;
    }
}
