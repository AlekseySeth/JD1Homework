package lesson8.heroes.enemy;

import lesson8.heroes.hero.Hero;

import java.util.Random;

/**
 * @author a.shestovsky
 */

public class Zombie extends Enemy {
    private boolean diedOnce = false;

    public Zombie(String enemyName) {
        super(enemyName, 100, 30);
    }

    @Override
    public void kill() {
        if (!diedOnce) {
            diedOnce = true;
            setEnemyHealth(20);
            System.out.println("+ " + getEnemyName() + " воскрес");
        } else {
            super.kill();
            System.out.println("† Наконец-то " + getEnemyName() + " покинул наш мир навсегда");
        }
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("< " + super.getEnemyName() + " атакует " + hero.getHeroName());
        hero.takeDamage(super.getEnemyDamage());
    }
}