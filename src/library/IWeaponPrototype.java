package library;

public interface IWeaponPrototype <T extends IWeaponPrototype> extends Cloneable{
    public T clone();
    public T deepClone();
}
