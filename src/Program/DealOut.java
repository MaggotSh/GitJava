package Program;

import Deal.Deal;
import Products.Product;

class DealOut {

    static void output(Deal d){
        StringBuilder sb = new StringBuilder();
            sb.append("Deal      ");
            sb.append(d.getDate());
            sb.append("\n");
            sb.append("  ");
            sb.append(d.getBayer().getName());
            sb.append("  buys in ");
            sb.append(d.getSeller().getName());
            sb.append("\n");

            for(Product pr : d.getProducts()){
                sb.append(pr);
                sb.append("\n");
            }
            sb.append("Sum ");
            sb.append(d.getSum());
            sb.append("\n");
            sb.append("Bayer        ");
            sb.append(d.getBayer());
            sb.append("\n");
            sb.append("Seller        ");
            sb.append(d.getSeller());

            System.out.println(sb.toString());
    }
}
