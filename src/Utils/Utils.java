package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

    static String keyboard(String message) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("write " + message + ": ");
        String rez = null;
        try {
            rez = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rez;
    }
    static boolean isChangedFirst(String first, String second){
        String a = keyboard("\"" + first + "\" or \"" + second + "\"?");
        if(first.equalsIgnoreCase(a)){
            return true;
        }else if(second.equalsIgnoreCase(a)){
            return false;
        }else throw new RuntimeException("Mistaeks input");
    }
}
