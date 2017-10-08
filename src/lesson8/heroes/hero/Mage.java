package lesson8.heroes.hero;

import lesson8.heroes.armor.MagicArmor;
import lesson8.heroes.enemy.Enemy;
import lesson8.heroes.gender.Gender;
import lesson8.heroes.race.Race;
import lesson8.heroes.weapon.MagicWeapon;

/**
 * @author a.shestovsky
 */

public class Mage<WEAPON extends MagicWeapon, ARMOR extends MagicArmor> extends Hero<WEAPON, ARMOR> {

    public Mage(String heroName, Gender heroGender, Race heroRace, WEAPON weapon, ARMOR armor) {
        super(heroName, heroGender, heroRace, 200, 20, weapon, armor);
        if (heroRace.equals(Race.ORC)) {
            setHeroHealth(getHeroHealth() + 20);
        } else if (heroRace.equals(Race.ELF)) {
            setHeroHealth(getHeroHealth() + 10);
            setHeroDamage(getHeroDamage() + 10);
        } else if (heroRace.equals(Race.HUMAN)) {
            setHeroHealth(getHeroHealth() + 20);
            setHeroDamage(getHeroDamage() + 30);
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (getHeroGender().equals(Gender.MALE)) {
            System.out.println("꙰ Маг " + getHeroRace().getRace() + " " + getHeroName() + " колдует " + getWeapon().getWeaponName() + "ом" );
        } else {
            System.out.println("꙰ Волшебница " + getHeroRace().getRace() + " " + getHeroName() + " колдует " + getWeapon().getWeaponName() + "ом" );
        }
        super.damageEnemy(enemy);
    }
}