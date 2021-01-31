package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior(){
        this.physDef = 80;
        this.physAtt = 30;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}

