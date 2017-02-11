package Party;

public class Party {

    private String name;
    private String adress;
    private String[] keys;
    private String[] values;

    public String[] getKeys() {
        return keys;
    }
    public void setKeys(String[] keys) {
        this.keys = keys;
    }
    public String[] getValues() {
        return values;
    }
    public void setValues(String[] values) {
        this.values = values;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: ");
        sb.append(getName());
        sb.append("; adress : ");
        sb.append(getAdress());
        sb.append("; ");
        if(keys.length>0){
            for(int i=0; i<keys.length; i++) {

                sb.append(keys[i]);
                sb.append(": ");
                sb.append(values[i]);
                sb.append("; ");
            }
        }
        return sb.toString();
    }
}
