package Products;

public abstract class Product {

    private static final int DEF_DISCONT = 10;

    private String title;
    private double price;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost(int quntity){
        double realCost = quntity*price;

        return realCost - realCost*colcDiscont(quntity)/100;
    }

    protected int colcDiscont(int quntity){
        if(quntity>10){
            return DEF_DISCONT;
        } else
            return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTitle());
        sb.append(" prise is: ");
        sb.append(getPrice());
        return sb.toString();
    }
}
