package lesson8.heroes.armor;

/**
 * @author a.shestovsky
 */

public class LeatherArmor implements LightArmor {

    @Override
    public int getArmor() {
        return 5;
    }

    @Override
    public String getArmorName() {
        return "Кожаный доспех";
    }

    @Override
    public int getArmorDamage() {
        return 0;
    }
}