package Products;

public class BotinkiProduct extends Product {

    private int size;
    private String color;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  botinki ");
        sb.append(super.toString());
        sb.append(" size: ");
        sb.append(getSize());
        sb.append(" color: ");
        sb.append(getColor());
        return sb.toString();
    }
}
