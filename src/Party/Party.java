package Party;

import java.util.HashMap;
import java.util.Map;

public class Party {

    private String name;
    private String adress;
    private Map<String,String> info = new HashMap<>();

    public void addInfo(String a, String b) {
        this.info.put(a,b);
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
        if(!info.isEmpty()){
            for(Map.Entry<String,String> en : info.entrySet()) {

                sb.append(en.getKey());
                sb.append(": ");
                sb.append(en.getValue());
                sb.append("; ");
            }
        }
        return sb.toString();
    }
}
