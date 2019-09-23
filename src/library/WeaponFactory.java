package library;

import java.util.HashMap;

public class WeaponFactory {
    private static HashMap<String,AbstWeapon> prototypes= new HashMap<>();
    
    public static void addPrototype(String pKey, AbstWeapon pPrototype){
        prototypes.put(pKey, pPrototype);
    }
    
    public static AbstWeapon getPrototype(String pKey){
        AbstWeapon prototype=prototypes.get(pKey);
        if (prototype !=null)return prototype.deepClone();
        else return null;
    }
    
    
}
