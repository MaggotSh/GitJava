package Deal;

import Party.Party;
import Products.Product;

import java.util.Date;

public class Deal {

    private Date date;
    private Party bayer;
    private Party seller;
    private Product[] products;

    public Deal (Party bayer, Party seller, Product[] products){

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
    public Product[] getProducts() {
        return products;
    }

    public double getSum(){
        double rez = 0;
        for(Product pr : products){
            rez += pr.getCost();
        }
        return rez;
    }
}
