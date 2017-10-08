package lesson8.heroes;

import lesson8.heroes.armor.*;
import lesson8.heroes.enemy.*;
import lesson8.heroes.gender.Gender;
import lesson8.heroes.hero.Archer;
import lesson8.heroes.hero.Hero;
import lesson8.heroes.hero.Mage;
import lesson8.heroes.hero.Warrior;
import lesson8.heroes.race.Race;
import lesson8.heroes.weapon.*;

/**
 * @author a.shestovsky
 */

public class BattleGround {

    public static void main(String[] args) {
        Enemy[] enemies = new Enemy[]{new Zombie("Злой Зомби"),
                                      new Vampire("Голодный Вампир"),
                                      new Werewolf("Клыкастый оборотень"),
                                      new Ghost("Призрак Дядюшки Сэма"),
                                      new Vampire("Граф Дракула")};

        Hero<MagicWeapon, MagicArmor> iceMage = new Mage<>("Лич", Gender.MALE, Race.HUMAN, new Staff(), new IceArmor());
        Hero<MagicWeapon, MagicArmor> fireMage = new Mage<>("Лина", Gender.FEMALE, Race.HUMAN, new Scepter(), new FireArmor());
        Hero<MagicWeapon, MagicArmor> stoneMage = new Mage<>("Друид", Gender.MALE, Race.ELF, new Staff(), new StoneArmor());

        Hero<MeleeWeapon, HeavyArmor> swordsman = new Warrior<>("Ланселот", Gender.MALE, Race.HUMAN, new Sword(), new SteelArmor());
        Hero<MeleeWeapon, HeavyArmor> axe = new Warrior<>("Акс", Gender.MALE, Race.ORC, new Axe(), new BronzeArmor());

        Hero<RangeWeapon, LightArmor> crossbowArcher = new Archer<>("Леголас", Gender.MALE, Race.ELF, new Crossbow(), new LeatherArmor());
        Hero<RangeWeapon, LightArmor> bowArcher = new Archer<>("Лиралей", Gender.FEMALE, Race.HUMAN, new Bow(), new LeatherArmor());

        battle(iceMage, enemies);
    }

    private static void battle(Hero hero, Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            fight(hero, enemy);
        }
        if (hero.isAlive()) {
            System.out.println("\n\uF04A Герой победил в сражении \uF04A");
        } else {
            System.out.println("\n\uF04CВраг победил в сражении\uF04C");
        }
    }

    public static void fight(Hero hero, Enemy enemy) {
        while (hero.isAlive() && enemy.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                enemy.attackHero(hero);
            }
        }
    }
}