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
    protected int colcDiscont (){
        int def = super.colcDiscont();
        if(!digital){
            def += NOT_DIGITAL_DISCONT;
        }
        return def;
    }
}
