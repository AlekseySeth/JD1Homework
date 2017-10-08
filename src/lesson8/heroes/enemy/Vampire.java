package lesson8.heroes.enemy;

import lesson8.heroes.hero.Hero;

import java.util.Random;

/**
 * @author a.shestovsky
 */

public class Vampire extends Enemy {

    public Vampire(String enemyName) {
        super(enemyName, 80, 40);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("< " + super.getEnemyName() + " атакует " + hero.getHeroName());
        hero.takeDamage(super.getEnemyDamage());
        int chanceToLifesteal = new Random().nextInt(10);
        if (chanceToLifesteal > 2) {
            setEnemyHealth(getEnemyHealth() + 10);
            System.out.println("+ " + getEnemyName() + " восстанавливает жизни");
            System.out.println("= " + getEnemyName() + " остался с " + getEnemyHealth() + " жизнями");
        }
    }
}