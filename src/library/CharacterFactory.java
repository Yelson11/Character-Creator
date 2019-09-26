/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Yelson
 */
public class CharacterFactory {
    
    private static HashMap<String,IPrototype<Character>> characterPrototypes = new HashMap<>();
    
    
    
    public static void addPrototype(String pKey, IPrototype<Character> pCharacter){
        characterPrototypes.put(pKey, pCharacter);
    }
    
    public static IPrototype<Character> getPrototype(String pName){
        IPrototype<Character> prototype= characterPrototypes.get(pName);
        if (prototype !=null)return prototype.deepClone();
        else return null;
    }
    
    public static ArrayList<IPrototype<Character>> getValues(){
        return (ArrayList<IPrototype<Character>>) characterPrototypes.values();
    }
    
}
