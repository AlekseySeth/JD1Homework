package lesson8.heroes.armor;

/**
 * @author a.shestovsky
 */
public class StoneArmor implements MagicArmor {

    @Override
    public int getArmor() {
        return 8;
    }

    @Override
    public int getArmorDamage() {
        return 1;
    }

    @Override
    public String getArmorName() {
        return "Каменная броня";
    }
}