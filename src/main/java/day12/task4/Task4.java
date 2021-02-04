package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        List<String> membersQueen = new ArrayList<>();
        List<String> memberTheBeatles = new ArrayList<>();
        musicBands.add(new MusicBand("Queen", 1970, membersQueen));
        musicBands.add(new MusicBand("The Beatles", 1960, memberTheBeatles));
        membersQueen.add("John");
        membersQueen.add("Paul");
        memberTheBeatles.add("Shakata");
        memberTheBeatles.add("Vasiok");
        membersQueen.add("Nastya");
        System.out.println(musicBands.toString());
        MusicBand.transferMembers(musicBands.get(0), musicBands.get(1));
        System.out.println(musicBands.toString());
        MusicBand.printMembers(musicBands.get(1));
        MusicBand.printMembers(musicBands.get(0));




    }
}
