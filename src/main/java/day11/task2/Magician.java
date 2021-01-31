package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
int magicAtt = 20;

    public Magician(){
        physAtt = 5;
        magicDef = 80;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = (1-(hero.magicDef/100))*magicAtt;
        if (hero.health < attack){
            hero.health = 0;
        }
        else {
            hero.health -= attack;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
