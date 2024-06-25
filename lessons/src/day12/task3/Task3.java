/*package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand ddt = new MusicBand("ddt", 1990);
        MusicBand rok = new MusicBand("rok", 1995);
        MusicBand pop = new MusicBand("pop", 2005);
        MusicBand lop = new MusicBand("lop", 2010);
        MusicBand top = new MusicBand("top", 2000);
        MusicBand spor = new MusicBand("spor", 2001);

        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(ddt);
        musicBandList.add(rok);
        musicBandList.add(pop);
        musicBandList.add(lop);
        musicBandList.add(top);
        musicBandList.add(spor);

        System.out.println(musicBandList);
        Collections.shuffle(musicBandList);
        System.out.println(musicBandList);

        List<MusicBand> bandsAfter2000 = groupsAfter2000(musicBandList);
        System.out.println("Bands formed after 2000:");
        System.out.println(bandsAfter2000);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand>musicBandList) {
            List<MusicBand> groupsAfter2000 = new ArrayList<>();
            for (MusicBand band : musicBandList) {
                if (band.getYear() > 2000)
                    groupsAfter2000.add(band);
            }

            return groupsAfter2000;
        }

}

 */
