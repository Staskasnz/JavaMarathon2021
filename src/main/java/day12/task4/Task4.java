package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Queen", 1970, new ArrayList<>()));
        musicBands.add(new MusicBand("The Beatles", 1960, new ArrayList<>()));

        musicBands.get(0).getMembers().add("John");
        musicBands.get(0).getMembers().add("Paul");
        musicBands.get(1).getMembers().add("Shakata");
        musicBands.get(1).getMembers().add("Vasiok");
        musicBands.get(0).getMembers().add("Nastya");
        System.out.println(musicBands.toString());
        MusicBand.transferMembers(musicBands.get(0), musicBands.get(1));
        System.out.println(musicBands.toString());
        MusicBand.printMembers(musicBands.get(1));
        MusicBand.printMembers(musicBands.get(0));




    }
}
