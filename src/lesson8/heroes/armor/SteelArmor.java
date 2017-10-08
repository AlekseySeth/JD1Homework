package lesson8.heroes.armor;

/**
 * @author a.shestovsky
 */

public class SteelArmor implements HeavyArmor {

    @Override
    public int getArmor() {
        return 10;
    }

    @Override
    public String getArmorName() {
        return "Стальной доспех";
    }

    @Override
    public int getArmorDamage() {
        return 0;
    }
}