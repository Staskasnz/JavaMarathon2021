package day12.task3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Queen", 1970));
        musicBands.add(new MusicBand("The Beatles", 1960));
        musicBands.add(new MusicBand("Coldplay", 1966));
        musicBands.add(new MusicBand("One Direction", 2011));
        musicBands.add(new MusicBand("Led Zeppelin", 1968));
        musicBands.add(new MusicBand("The Rolling Stones", 1962));
        musicBands.add(new MusicBand("Oasis", 1991));
        musicBands.add(new MusicBand("Take That", 1989));
        musicBands.add(new MusicBand("The Who", 1964));
        musicBands.add(new MusicBand("The Smiths", 1982));

        Collections.shuffle(musicBands);
        groupsAfter2000(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands){
        List<MusicBand> newList = new ArrayList<>();
        for (int i = 0; i < musicBands.size(); i++) {
            if (musicBands.get(i).getYear() > 2000) {
                newList.add(new MusicBand(musicBands.get(i).getName(), musicBands.get(i).getYear()));
            }
        }
        return newList;
    }
}


