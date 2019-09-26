
package library;

public class Weapon implements IPrototype<Weapon>{
    protected String name;
    protected int scope;
    protected int range;
    protected int level;
    protected int damage;
    protected int cost;
    protected int levelRequired;
    protected String image;

    public Weapon(String name, int scope, int range, int level, int damage, int cost, int levelRequired, String image) {
        this.name = name;
        this.scope = scope;
        this.range = range;
        this.level = level;
        this.damage = damage;
        this.cost = cost;
        this.levelRequired = levelRequired;
        this.image = image;
    }

   

    @Override
    public Weapon clone() {
        Weapon clone;
        clone= new Weapon(name,scope,range,level,damage,cost, levelRequired,image);
        return clone;
    }

    @Override
    public Weapon deepClone() {
        int scopec,rangec,levelc,damagec,costc,levelRequiredc;
        String namec,imagec;
        namec          = this.name;
        scopec         = this.scope;
        rangec         = this.range;
        levelc         = this.level;
        damagec        = this.damage;
        costc          = this.cost;
        levelRequiredc = this.levelRequired;
        imagec         = this.image;
        Weapon clone;
        clone= new Weapon(namec,scopec,rangec,levelc,damagec,costc,levelRequiredc,imagec);
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLevelRequired() {
        return levelRequired;
    }

    public void setLevelRequired(int levelRequired) {
        this.levelRequired = levelRequired;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", scope=" + scope + ", range=" + range + ", level=" + level + ", damage=" + damage + ", cost=" + cost + ", levelRequired=" + levelRequired + ", image=" + image + '}';
    }

    
    //---------------------------- Builder Pattern -----------------------------
    
    public static class WeaponBuilder implements IBuilder<Weapon>{

        private String name;
        private int scope;
        private int range;
        private int level;
        private int damage;
        private int cost;
        private int levelRequired;
        private String image;

        public WeaponBuilder() {
            this.name   = "";
            this.scope  = 1;
            this.range  = 1;
            this.level  = 1;
            this.damage = 1;
            this.cost   = 0;
            this.levelRequired = 1;
            this.image = "";
        }
        
        

        public WeaponBuilder addName(String name) {
            this.name = name;
            return this;
        }

        public WeaponBuilder addScope(int scope) {
            this.scope = scope;
            return this;
        }
        
        public WeaponBuilder addRange(int range){
            this.range=range;
            return this;
        }

        public WeaponBuilder addLevel(int level) {
            this.level = level;
            return this;
        }

        public WeaponBuilder addDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public WeaponBuilder addCost(int cost) {
            this.cost = cost;
            return this;
        }

        public WeaponBuilder addLevelRequired(int levelRequired) {
            this.levelRequired = levelRequired;
            return this;
        }

        public WeaponBuilder addImage(String image) {
            this.image = image;
            return this;
        }
        
        
        @Override
        public Weapon build() {
            return new Weapon(name,scope,range,level,damage,cost,levelRequired,image);
        }
    }
    
    
}
