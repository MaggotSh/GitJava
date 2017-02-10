package Program;

import Deal.Deal;
import Products.Product;

class DealOut {

    static void output(Deal d){
        StringBuilder s = new StringBuilder();
            s.append("Deal      ");
            s.append(d.getDate());
            s.append("\n");
            s.append("  ");
            s.append(d.getBayer().getName());
            s.append("  buys in ");
            s.append(d.getSeller().getName());
            s.append("\n");

            for(Product pr : d.getProducts()){
                s.append("      ");
                s.append(pr.getTitle());
                s.append(" ");
                s.append(pr.getQuntity());
                s.append(" x ");
                s.append(pr.getCost());
                s.append("\n");
            }
            s.append("Sum ");
            s.append(d.getSum());
            s.append("\n");
            s.append("Bayer        ");
            s.append("adress : ");
            s.append(d.getBayer().getAdress());
            s.append("\n");
            s.append("Seller        ");
            s.append("adress : ");
            s.append(d.getSeller().getAdress());
            System.out.println(s.toString());
    }
}
