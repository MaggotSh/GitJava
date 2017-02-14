package Program;

import Deal.Deal;
import Products.Product;
import java.util.Map;
import static Utils.Input.input;

public class Program {

    public static void main(String[] args) {
        Deal d = input();
        output(d);
    }

    private static void output(Deal d){
        StringBuilder sb = new StringBuilder();
        sb.append("Deal      ");
        sb.append(d.getDate());
        sb.append("\n");
        sb.append("  ");
        sb.append(d.getBayer().getName());
        sb.append("  buys in ");
        sb.append(d.getSeller().getName());
        sb.append("\n");

        for(Map.Entry<Product,Integer> en : d.getProducts().entrySet()){
            sb.append(en.getKey());
            sb.append("     || x ");
            sb.append(en.getValue());
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
