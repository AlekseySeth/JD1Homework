package lesson8.heroes.enemy;

import lesson8.heroes.hero.Hero;

import java.util.Random;

/**
 * @author a.shestovsky
 */
public class Ghost extends Enemy {

    public Ghost(String enemyName) {
        super(enemyName, 90, 20);
    }

    @Override
    public void takeDamage(int damage) {
        int chanceToMiss = new Random().nextInt(10);
        if (chanceToMiss > 6) {
            System.out.println("o " + getEnemyName() + " увернулся");
        } else {
            System.out.println("- " + getEnemyName() + " получает " + damage + " урона");
            if (getEnemyHealth() > damage) {
                setEnemyHealth(getEnemyHealth() - damage);
                System.out.println("= " + getEnemyName() + " остался с " + getEnemyHealth() + " жизнями");
            } else {
                kill();
            }
        }
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("< " + super.getEnemyName() + " атакует " + hero.getHeroName());
        hero.takeDamage(super.getEnemyDamage());
    }

}