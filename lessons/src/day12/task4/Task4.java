package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> pib1 = new ArrayList<>();
        pib1.add("Paul");
        pib1.add("Santa");
        pib1.add("Tor On");
        pib1.add("Clone");

        MusicBand ddt = new MusicBand("ddt", 1990, pib1);

        ddt.printMembers();

        List<String> pib2 = new ArrayList<>();
        pib2.add("Paul2");
        pib2.add("Santa2");
        pib2.add("Tor On2");
        pib2.add("Clone2");

        MusicBand sky = new MusicBand("sky", 1993, pib2);

        MusicBand.transferMembers(ddt, sky);

        ddt.printMembers();
        sky.printMembers();

    }
}
