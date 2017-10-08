package lesson8.heroes.weapon;

/**
 * @author a.shestovsky
 */

public class Sword implements MeleeWeapon {

    @Override
    public int getWeaponDamage() {
        return 15;
    }

    @Override
    public String getWeaponName() {
        return "меч";
    }
}