package day12.task5;

public class MusicArtists {
    int ageOfArtist;
    String nemeOfArtist;

    public MusicArtists(int ageOfArtist, String nemeOfArtist) {
        this.ageOfArtist = ageOfArtist;
        this.nemeOfArtist = nemeOfArtist;
    }

    public int getAgeOfArtist() {
        return ageOfArtist;
    }

    public void setAgeOfArtist(int ageOfArtist) {
        this.ageOfArtist = ageOfArtist;
    }

    public String getNemeOfArtist() {
        return nemeOfArtist;
    }

    public void setNemeOfArtist(String nemeOfArtist) {
        this.nemeOfArtist = nemeOfArtist;
    }

    @Override
    public String toString() {
        return "MusicArtists{" +
                "ageOfArtist=" + ageOfArtist +
                ", nemeOfArtist='" + nemeOfArtist + '\'' +
                '}';
    }
}
