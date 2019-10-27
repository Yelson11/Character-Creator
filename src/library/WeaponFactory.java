package library;

import java.util.ArrayList;
import java.util.HashMap;

public class WeaponFactory {
    private static HashMap<String,IPrototype<Weapon>> prototypes= new HashMap<>();
    
    public static void addPrototype(String pKey, Weapon pPrototype){
        prototypes.put(pKey, pPrototype);
    }
    
    public static IPrototype<Weapon> getPrototype(String pKey){
        IPrototype<Weapon> prototype=prototypes.get(pKey);
        if (prototype !=null)return prototype.deepClone();
        else return null;
    }
    
    public static ArrayList<IPrototype<Weapon>> getPrototypes(String pKey, int pQuantity){
        ArrayList<IPrototype<Weapon>> weapons;
        IPrototype<Weapon> prototype = prototypes.get(pKey);
        if (prototype != null){
            weapons = new ArrayList<>();
            for (int i = 0; i < pQuantity; i++){
                weapons.add(prototype.deepClone());
            }
        }else{
            weapons = null;
        }
        return weapons;
    }
}
