package cz.educanet.arena.logic;

import java.util.Random;

public class Gladiator {

    private String jmeno;
    private int Damage;
    private int minimalDamage;
    private int maximumDamage;
    private int fullHP;
    private int HP;

    public boolean isDead() {
        return HP <= 0;
    }

    public void dealDamage(Gladiator enemy) {
        Random ran = new Random();
        setDamage(ran.nextInt(maximumDamage - minimalDamage));
        enemy.setHP(enemy.getHP()-Damage);
    }
    public String getName() {
        return jmeno;
    }
    public void setName(String name) {
        this.jmeno = name;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getFullHP() {
        return fullHP;
    }
    public void setFullHP(int fullHP) {
        this.fullHP = fullHP;
        this.HP = fullHP;
    }
    public void setDamage(int Damage) {
        this.Damage = Damage;
    }
    public void setMaximumDamage(int maxDamage) {
        this.maximumDamage = maxDamage;
    }

    public void setMinimalDamage(int minDamage) {
        this.minimalDamage = minDamage;
    }
}