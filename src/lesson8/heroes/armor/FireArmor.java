package lesson8.heroes.armor;

/**
 * @author a.shestovsky
 */

public class FireArmor implements MagicArmor {

    @Override
    public int getArmor() {
        return 3;
    }

    @Override
    public int getArmorDamage() {
        return 3;
    }

    @Override
    public String getArmorName() {
        return "Огненная броня";
    }
}