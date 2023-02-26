package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("ZAZ", 2005, 150, 30000);
        Airplane airplane2 = new Airplane("TAZ", 2010, 100, 30000);

        Airplane.compareLenghtAirplane(airplane1, airplane2);
    }
}
