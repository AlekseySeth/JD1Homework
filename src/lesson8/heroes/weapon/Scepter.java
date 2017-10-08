package lesson8.heroes.weapon;

/**
 * @author a.shestovsky
 */
public class Scepter implements MagicWeapon {

    @Override
    public int getWeaponDamage() {
        return 10;
    }

    @Override
    public String getWeaponName() {
        return "скипетр";
    }
}