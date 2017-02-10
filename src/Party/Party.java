package Party;

public class Party {

    private String name;
    private String adress;
    private String[] keys = new String[0];
    private String[] values;

    public void addKeys(String key){
        int oldLength = this.keys.length;
        String[] newKeys = new String[oldLength+1];
        for(int i=0; i<oldLength; i++){
            newKeys[i] = this.keys[i];
        }
        newKeys[newKeys.length-1] = key;
        keys = null;
        String[] keys = newKeys;
        for(String s : keys){
            System.out.println(s);
        }
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
}


class PartyUnit {
    public static void main(String[] args) {
        Party p = new Party();
        p.addKeys("sss");
        p.addKeys("dssd");

    }
}
