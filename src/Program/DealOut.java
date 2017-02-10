package Program;

import Deal.Deal;
import Product.Product;

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
            System.out.println(s.toString());
    }
}
