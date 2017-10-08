package lesson8.heroes.hero;

import lesson8.heroes.armor.HeavyArmor;
import lesson8.heroes.enemy.Enemy;
import lesson8.heroes.gender.Gender;
import lesson8.heroes.race.Race;
import lesson8.heroes.weapon.MeleeWeapon;

/**
 * @author a.shestovsky
 */

public class Warrior<WEAPON extends MeleeWeapon, ARMOR extends HeavyArmor> extends Hero<WEAPON, ARMOR> {

    public Warrior(String heroName, Gender heroGender, Race heroRace, WEAPON weapon, ARMOR armor) {
        super(heroName, heroGender, heroRace, 300, 30, weapon, armor);
        if (heroRace.equals(Race.ORC)) {
            setHeroHealth(getHeroHealth() + 50);
            setHeroDamage(getHeroDamage() + 30);
        } else if (heroRace.equals(Race.ELF)) {
            setHeroHealth(getHeroHealth() + 20);
            setHeroDamage(getHeroDamage() + 20);
        } else if (heroRace.equals(Race.HUMAN)) {
            setHeroHealth(getHeroHealth() + 10);
            setHeroDamage(getHeroDamage() + 10);
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (getHeroGender().equals(Gender.MALE)) {
            System.out.println("/ Воин " + getHeroRace().getRace() + " " + getHeroName() + " бьет " + getWeapon().getWeaponName() + "ом");
        } else {
            System.out.println("/ Воительница " + getHeroRace().getRace() + " " + getHeroName() + " бьет " + getWeapon().getWeaponName() + "ом");
        }
        super.damageEnemy(enemy);
    }
}