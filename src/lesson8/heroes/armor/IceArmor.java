package lesson8.heroes.armor;

/**
 * @author a.shestovsky
 */

public class IceArmor implements MagicArmor {

    @Override
    public int getArmor() {
        return 6;
    }

    @Override
    public int getArmorDamage() {
        return 2;
    }

    @Override
    public String getArmorName() {
        return "Ледяная броня";
    }
}