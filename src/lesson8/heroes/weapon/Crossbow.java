package lesson8.heroes.weapon;

/**
 * @author a.shestovsky
 */

public class Crossbow implements RangeWeapon {

    @Override
    public int getWeaponDamage() {
        return 15;
    }

    @Override
    public String getWeaponName() {
        return "арбалет";
    }
}