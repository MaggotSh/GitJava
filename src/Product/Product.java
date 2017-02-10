package Product;

public class Product {

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
        return quntity*price;
    }
}
