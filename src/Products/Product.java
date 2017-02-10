package Products;

public abstract class Product {

    private static final int DEF_DISCONT = 10;

    private String title;
    private double price;
    private int quntity;

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
    public int getQuntity() {
        return quntity;
    }
    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public double getCost(){
        double realCost = quntity*price;

        return realCost - realCost*colcDiscont()/100;
    }

    protected int colcDiscont(){
        if(quntity>10){
            return DEF_DISCONT;
        } else
            return 0;
    }


}
