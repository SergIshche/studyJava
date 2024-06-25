package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtists> members1 = new ArrayList<>();
        members1.add(new MusicArtists(15, "Tom"));
        members1.add(new MusicArtists(65, "Jack"));

        MusicBand ddt = new MusicBand("ddt", 1990, members1);

        ddt.printMembers();

        List<MusicArtists> members2 = new ArrayList<>();
        members2.add(new MusicArtists(68, "Jack2"));
        members2.add(new MusicArtists(67, "Tom2"));


        MusicBand sky = new MusicBand("sky", 1993, members2);

        MusicBand.transferMembers(ddt, sky);

        ddt.printMembers();
        sky.printMembers();

    }
}
