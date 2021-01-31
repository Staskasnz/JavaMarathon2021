package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    double magicDef;
    double physAtt;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = (1-(hero.physDef/100))*physAtt;
        if (hero.health < attack){
            hero.health = 0;
        }
        else {
            hero.health -= attack;
        }
    }
}
