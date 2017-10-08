package lesson8.heroes.armor;

/**
 * @author a.shestovsky
 */

public class BronzeArmor implements HeavyArmor {

    @Override
    public int getArmor() {
        return 8;
    }

    @Override
    public String getArmorName() {
        return "Бронзовый доспех";
    }

    @Override
    public int getArmorDamage() {
        return 0;
    }
}