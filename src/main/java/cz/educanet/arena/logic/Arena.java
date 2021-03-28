package cz.educanet.arena.logic;

public class Arena {

    private Gladiator gladiator1;
    private Gladiator gladiator2;

    private int round = 1;

    public void fight() {
        gladiator1.dealDamage(gladiator2);
        gladiator2.dealDamage(gladiator1);
        round++;
    }
    public Gladiator getWinner() {
        if (gladiator1.isDead()){
            return gladiator2;
        }
        if (gladiator2.isDead()){
            return gladiator1;
        }

        return null;
    }

    public Gladiator getGladiator1() {
        return gladiator1;
    }
    public Gladiator getGladiator2() {
        return gladiator2;
    }
    public int getRound() {
        return round;
    }
    public void setGladiator1(Gladiator gladiator1) {
        this.gladiator1 = gladiator1;
    }
    public void setGladiator2(Gladiator gladiator2) {
        this.gladiator2 = gladiator2;
    }
}