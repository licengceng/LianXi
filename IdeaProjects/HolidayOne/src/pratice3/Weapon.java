package pratice3;
public class Weapon extends Item{

    @Override
    public boolean disposable() {
        System.out.println(name+"冷却中");
        return false;
    }

    public static void main(String[] args) {
       Weapon weapon=new Weapon();
       weapon.disposable();
    }
}