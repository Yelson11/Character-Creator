/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 * @author Yelson
 */
public abstract class Character implements IPrototype<Character>{
    
    private String name;
    private ArrayList<String> images;
    private int life;
    private ArrayList<Weapon> usedWeapons;
    private int limitWeaponQuantity;
    private int level;
    private int space;
    private int levelRequired;
    private int cost;
    private ArrayList<String> availableWeapons;
    private Weapon currentWeapon;
    
    private Character(String pName, ArrayList<String> pImages, int pLife, int pLimitWeaponQuantity, int pLevel, int pSpace, int pLevelRequired, int pCost, ArrayList<String> pAvailableWeapons,Weapon pCurrentWeapon){
        name = pName;
        images = pImages;
        life = pLife;
        usedWeapons = new ArrayList<>();
        limitWeaponQuantity = pLimitWeaponQuantity;
        level = pLevel;
        space = pSpace;
        levelRequired = pLevelRequired;
        cost = pCost;
        availableWeapons = pAvailableWeapons;
        currentWeapon = pCurrentWeapon;
    }
    
    public Character(String pName, int pLife, int pLimitWeaponQuantity, int pLevel, int pSpace, int pLevelRequired, int pCost, Weapon pCurrentWeapon){
        name = pName;
        life = pLife;
        limitWeaponQuantity = pLimitWeaponQuantity;
        level = pLevel;
        space = pSpace;
        levelRequired = pLevelRequired;
        cost = pCost;
        currentWeapon = pCurrentWeapon;
    }
    
    //-------------------------------- Métodos --------------------------------
    public void move(){};
    public void attack(){};
    public void changeWeapon(int pWeapon){};
    public void getCharacter(){};

    @Override
    public Character clone() {
        Character clone = new Character(name, life, limitWeaponQuantity, level, space, levelRequired, cost, currentWeapon){};
        clone.setAvailableWeapons(availableWeapons);
        clone.setImages(images);
        return clone; 
    }

     @Override
     public Character deepClone() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
    
    //-------------------------- Getters and Setters ---------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public ArrayList<Weapon> getUsedWeapons() {
        return usedWeapons;
    }

    public void setUsedWeapons(ArrayList<Weapon> usedWeapons) {
        this.usedWeapons = usedWeapons;
    }

    public int getLimitWeaponQuantity() {
        return limitWeaponQuantity;
    }

    public void setLimitWeaponQuantity(int limitWeaponQuantity) {
        this.limitWeaponQuantity = limitWeaponQuantity;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(int levelRequired) {
        this.levelRequired = levelRequired;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ArrayList<String> getAvailableWeapons() {
        return availableWeapons;
    }

    public void setAvailableWeapons(ArrayList<String> availableWeapons) {
        this.availableWeapons = availableWeapons;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }
    
}