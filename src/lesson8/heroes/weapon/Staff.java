package lesson8.heroes.weapon;

/**
 * @author a.shestovsky
 */

public class Staff implements MagicWeapon {

    @Override
    public int getWeaponDamage() {
        return 15;
    }

    @Override
    public String getWeaponName() {
        return "посох";
    }
}