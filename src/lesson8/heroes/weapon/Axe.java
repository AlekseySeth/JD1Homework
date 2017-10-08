package lesson8.heroes.weapon;

/**
 * @author a.shestovsky
 */

public class Axe implements MeleeWeapon {

    @Override
    public int getWeaponDamage() {
        return 20;
    }

    @Override
    public String getWeaponName() {
        return "топор";
    }
}