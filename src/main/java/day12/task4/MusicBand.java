package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public static void changeMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<String> membersCopy;
        membersCopy = musicBand1.members;
        musicBand1.members = musicBand2.members;
        musicBand2.members = membersCopy;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<String> transfersCopy = new ArrayList<>(musicBand1.members);
        transfersCopy.addAll(musicBand2.members);
        musicBand2.members = transfersCopy;
        musicBand1.members.clear();
    }

    public static void printMembers(MusicBand musicBand) {
        System.out.println(musicBand.getMembers().toString());
    }
}
