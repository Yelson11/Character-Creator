package library;


public class AbstWeapon implements IWeaponPrototype<AbstWeapon> {
    
    protected String name;
    protected int scope;
    protected int level;
    protected int damage;
    protected int cost;
    protected int levelRequired;
    protected String image;

    public AbstWeapon(String name, int scope, int level, int damage, int cost, int levelRequired, String image) {
        this.name = name;
        this.scope = scope;
        this.level = level;
        this.damage = damage;
        this.cost = cost;
        this.levelRequired = levelRequired;
        this.image = image;
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
        return "AbstWeapon{" + "name=" + name + ", scope=" + scope + ", level=" + level + ", damage=" + damage + ", cost=" + cost + ", levelRequired=" + levelRequired + ", image=" + image + '}';
    }
    
    
    

    @Override
    public AbstWeapon clone() {
        AbstWeapon clone;
        clone= new AbstWeapon(name,scope,level,damage,cost, levelRequired,image);
        return clone;
    }

    @Override
    public AbstWeapon deepClone() {
        int scopec,levelc,damagec,costc,levelRequiredc;
        String namec,imagec;
        namec          = this.name;
        scopec         = this.scope;
        levelc         = this.level;
        damagec        = this.damage;
        costc          = this.cost;
        levelRequiredc = this.levelRequired;
        imagec         = this.image;
        AbstWeapon clone;
        clone= new AbstWeapon(namec,scopec,levelc,damagec,costc,levelRequiredc,imagec);
        return clone;
    }
    
}
