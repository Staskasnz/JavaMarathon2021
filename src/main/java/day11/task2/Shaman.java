package day11.task2;

import static day11.task2.Paladin.MAX_HEALTH;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    public static final int SHAMAN_HEAL_HIMSELF = 50;
    public static final int SHAMAN_HEAL_TEAMMATE = 30;
    int magicAtt = 15;

    public Shaman() {
        physAtt = 10;
        physDef = 20;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        if (health + SHAMAN_HEAL_HIMSELF > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += SHAMAN_HEAL_HIMSELF;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + SHAMAN_HEAL_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += SHAMAN_HEAL_TEAMMATE;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = (1 - (hero.magicDef / 100)) * magicAtt;
        if (hero.health < attack) {
            hero.health = 0;
        } else {
            hero.health -= attack;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
