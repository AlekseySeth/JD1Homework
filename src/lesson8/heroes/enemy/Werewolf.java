package lesson8.heroes.enemy;

import lesson8.heroes.hero.Hero;

import java.util.Random;

/**
 * @author a.shestovsky
 */
public class Werewolf extends Enemy {

    public Werewolf(String enemyName) {
        super(enemyName, 120, 30);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("< " + super.getEnemyName() + " атакует " + hero.getHeroName());
        int chanceToCrit = new Random().nextInt(10);
        if (chanceToCrit > 4) {
            System.out.println("<< " + super.getEnemyName() + " в полнолуние наносит критический удар");
            hero.takeDamage(super.getEnemyDamage() * 2);
        } else {
            hero.takeDamage(super.getEnemyDamage());
        }
    }
}