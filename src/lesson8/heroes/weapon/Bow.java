package lesson8.heroes.weapon;

/**
 * @author a.shestovsky
 */

public class Bow implements RangeWeapon {

    @Override
    public int getWeaponDamage() {
        return 10;
    }

    @Override
    public String getWeaponName() {
        return "лук";
    }
}