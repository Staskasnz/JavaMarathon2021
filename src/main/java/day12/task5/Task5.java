package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Queen", 1970, new ArrayList<>()));
        musicBands.add(new MusicBand("The Beatles", 1960, new ArrayList<>()));

        musicBands.get(0).getMembers().add(new MusicArtist("John", 80));
        musicBands.get(0).getMembers().add(new MusicArtist("Paul", 15));
        musicBands.get(1).getMembers().add(new MusicArtist("Shakata", 24));
        musicBands.get(1).getMembers().add(new MusicArtist("Vasiok", 35));
        musicBands.get(0).getMembers().add(new MusicArtist("Nastya", 55));
        System.out.println(musicBands.toString());
        MusicBand.transferMembers(musicBands.get(0), musicBands.get(1));
        System.out.println(musicBands.toString());
        MusicBand.printMembers(musicBands.get(1));
    }
}
