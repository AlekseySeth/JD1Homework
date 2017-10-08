package lesson8.heroes.hero;

import lesson8.heroes.armor.Armor;
import lesson8.heroes.armor.MagicArmor;
import lesson8.heroes.enemy.Enemy;
import lesson8.heroes.gender.Gender;
import lesson8.heroes.race.Race;
import lesson8.heroes.weapon.Weapon;

import java.util.Random;

/**
 * @author a.shestovsky
 */

public abstract class Hero<WEAPON extends Weapon, ARMOR extends Armor> implements Mortal {
    private WEAPON weapon;
    private ARMOR armor;
    private String heroName;
    private Gender heroGender;
    private Race heroRace;
    private int heroDamage;
    private int heroHealth;

    public Hero(String heroName, Gender heroGender, Race heroRace, int heroHealth, int heroDamage, WEAPON weapon, ARMOR armor) {
        this.weapon = weapon;
        this.armor = armor;
        this.heroName = heroName;
        this.heroGender = heroGender;
        this.heroRace = heroRace;
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Gender getHeroGender() {
        return heroGender;
    }

    public void setHeroGender(Gender heroGender) {
        this.heroGender = heroGender;
    }

    public Race getHeroRace() {
        return heroRace;
    }

    public void setHeroRace(Race heroRace) {
        this.heroRace = heroRace;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public void takeDamage(int damage) {
        int chanceToBlock = new Random().nextInt(10);
        if (chanceToBlock > 2) {
            blockDamage();
            damage -= armor.getArmor();
        }
        System.out.println("- " + heroName + " получает " + damage + " урона");
        if (heroHealth > damage) {
                heroHealth -= damage;
                System.out.println("= " + heroName + " остался с " + heroHealth + " жизнями");
            } else {
                kill();

        }
    }

    public void blockDamage() {
        System.out.println("◊ " + armor.getArmorName() + " блокирует " + armor.getArmor() + " урона");
    }

    public abstract void attackEnemy(Enemy enemy);

    protected void damageEnemy(Enemy enemy) {
        if (armor instanceof MagicArmor) {
            System.out.println("꙰ Магическая " + armor.getArmorName() + " наносит дополнительные " + armor.getArmorDamage() + " урона");
            enemy.takeDamage(getHeroDamage() + weapon.getWeaponDamage() + armor.getArmorDamage());
        } else {
            enemy.takeDamage(getHeroDamage() + weapon.getWeaponDamage());
        }
    }

    @Override
    public boolean isAlive() {
        return heroHealth > 0;
    }

    @Override
    public void kill() {
        heroHealth = 0;
        System.out.println("† " + getHeroName() + " погиб в сражении");
    }

    public WEAPON getWeapon() {
        return weapon;
    }

    public void setWeapon(WEAPON weapon) {
        this.weapon = weapon;
    }

    public ARMOR getArmor() {
        return armor;
    }

    public void setArmor(ARMOR armor) {
        this.armor = armor;
    }
}