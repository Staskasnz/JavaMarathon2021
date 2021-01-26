package day6;

import org.w3c.dom.ls.LSOutput;

public class Task2 {
    public static void main(String[] args) {
        Airplane superJet = new Airplane("Russia", 2011, 30, 42500);
        superJet.setYear(2012);
        superJet.setLength(31);
        superJet.fillUp(1000);
        superJet.fillUp(500);
        superJet.info();
    }

}
