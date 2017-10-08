package lesson8.heroes;

import lesson8.heroes.armor.FireArmor;
import lesson8.heroes.armor.LeatherArmor;
import lesson8.heroes.armor.LightArmor;
import lesson8.heroes.armor.SteelArmor;
import lesson8.heroes.enemy.Enemy;
import lesson8.heroes.enemy.Ghost;
import lesson8.heroes.enemy.Vampire;
import lesson8.heroes.enemy.Zombie;
import lesson8.heroes.gender.Gender;
import lesson8.heroes.hero.Archer;
import lesson8.heroes.hero.Hero;
import lesson8.heroes.hero.Mage;
import lesson8.heroes.hero.Warrior;
import lesson8.heroes.race.Race;
import lesson8.heroes.weapon.Axe;
import lesson8.heroes.weapon.Bow;
import lesson8.heroes.weapon.Staff;

/**
 * @author a.shestovsky
 */

public class TrainingGround {

    public static void main(String[] args) {

        Hero<Staff, FireArmor> mage = new Mage<>("Маг", Gender.MALE, Race.HUMAN, new Staff(), new FireArmor());
        Enemy ghost = new Ghost("Призрак");

        mage.attackEnemy(ghost);
        ghost.attackHero(mage);

        Hero<Axe, SteelArmor> warrior = new Warrior<>("Воин", Gender.MALE, Race.ORC, new Axe(), new SteelArmor());
        Enemy vampire = new Vampire("Вампир");

        warrior.attackEnemy(vampire);
        vampire.attackHero(warrior);

        Hero<Bow, LightArmor> archer = new Archer<>("Лучник", Gender.FEMALE, Race.ELF, new Bow(), new LeatherArmor());
        Enemy zombie = new Zombie("Зомби");

        archer.attackEnemy(zombie);
        zombie.attackHero(archer);

    }
}