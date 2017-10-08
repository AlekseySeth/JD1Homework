package lesson8.heroes.hero;

import lesson8.heroes.armor.LightArmor;
import lesson8.heroes.enemy.Enemy;
import lesson8.heroes.gender.Gender;
import lesson8.heroes.race.Race;
import lesson8.heroes.weapon.RangeWeapon;

/**
 * @author a.shestovsky
 */

public class Archer<WEAPON extends RangeWeapon, ARMOR extends LightArmor> extends Hero<WEAPON, ARMOR> {

    public Archer(String heroName, Gender heroGender, Race heroRace, WEAPON weapon, ARMOR armor) {
        super(heroName, heroGender, heroRace, 250, 20, weapon, armor);
        if (heroRace.equals(Race.ORC)) {
            setHeroHealth(getHeroHealth() + 30);
        } else if (heroRace.equals(Race.ELF)) {
            setHeroHealth(getHeroHealth() + 10);
            setHeroDamage(getHeroDamage() + 30);
        } else if (heroRace.equals(Race.HUMAN)) {
            setHeroDamage(getHeroDamage() + 10);
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (getHeroGender().equals(Gender.MALE)) {
            System.out.println("↗ Лучник " + getHeroRace().getRace() + " " + getHeroName() + " стреляет из " + getWeapon().getWeaponName() + "а");
        } else {
            System.out.println("↗ Лучница " + getHeroRace().getRace() + " " + getHeroName() + " стреляет из " + getWeapon().getWeaponName() + "а");
        }
        super.damageEnemy(enemy);
    }
}