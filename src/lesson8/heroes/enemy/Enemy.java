package lesson8.heroes.enemy;

import lesson8.heroes.hero.Mortal;
import lesson8.heroes.hero.Hero;

/**
 * @author a.shestovsky
 */

public abstract class Enemy implements Mortal {

    private String enemyName;
    private int enemyHealth;
    private int enemyDamage;

    public Enemy(String enemyName, int enemyHealth, int enemyDamage) {
        this.enemyName = enemyName;
        this.enemyDamage = enemyDamage;
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void takeDamage(int damage) {
        System.out.println("- " + enemyName + " получает " + damage + " урона");
        if (enemyHealth > damage) {
            enemyHealth -= damage;
            System.out.println("= " + enemyName + " остался с " + enemyHealth + " жизнями");
        } else {
            kill();
        }
    }

    public abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        return enemyHealth > 0;
    }

    @Override
    public void kill() {
        enemyHealth = 0;
        System.out.println("† " + enemyName + " погибает");
    }
}