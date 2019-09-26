package library;

import java.util.ArrayList;
import java.util.HashMap;

public class WeaponFactory {
    private static HashMap<String,Weapon> prototypes= new HashMap<>();
    
    public static void addPrototype(String pKey, Weapon pPrototype){
        prototypes.put(pKey, pPrototype);
    }
    
    public static Weapon getPrototype(String pKey){
        Weapon prototype=prototypes.get(pKey);
        if (prototype !=null)return prototype.deepClone();
        else return null;
    }
    
    public static ArrayList<Weapon> getValues(){
        return (ArrayList<Weapon>) prototypes.values();
    }
    
    
}
