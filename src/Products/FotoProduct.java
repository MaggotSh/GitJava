package Products;

public class FotoProduct extends Product {

    private static final int NOT_DIGITAL_DISCONT = 20;
    private double megapx;
    private boolean digital;

    public double getMegapx() {
        return megapx;
    }
    public void setMegapx(double megapx) {
        this.megapx = megapx;
    }
    public boolean isDigital() {
        return digital;
    }
    public void setDigital(boolean digital) {
        this.digital = digital;
    }
        @Override
    protected int colcDiscont (int quntity){
        int def = super.colcDiscont(quntity);
        if(!digital){
            def += NOT_DIGITAL_DISCONT;
        }
        return def;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  fotik ");
        sb.append(super.toString());
        sb.append("  Megapx: ");
        sb.append(getMegapx());
        if(isDigital()){
            sb.append(" is digital");
        }
        return sb.toString();
    }
}
