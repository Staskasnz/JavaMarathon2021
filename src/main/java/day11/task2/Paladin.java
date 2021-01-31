package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    protected static final int MAX_HEALTH = 100;
    public static final int PALADIN_HEAL_HIMSELF = 25;
    public static final int PALADIN_HEAL_TEAMMATE = 20;

    public Paladin(){
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + PALADIN_HEAL_HIMSELF > MAX_HEALTH){
            health = MAX_HEALTH;
        }
        else {
            health += PALADIN_HEAL_HIMSELF;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + PALADIN_HEAL_TEAMMATE > MAX_HEALTH){
            health = MAX_HEALTH;
        }
        else {
            hero.health += PALADIN_HEAL_TEAMMATE;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}

