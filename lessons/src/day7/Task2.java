package day7;

public class Task2 {
    public static void main (String[] args) {
        Player player1 = new Player(95);
        Player player2 = new Player(97);
        Player player3 = new Player(93);
        Player player4 = new Player(100);
        Player player5 = new Player(90);
        Player.info();
        Player player6 = new Player(100);

        Player.info();

        Player player7 = new Player(95);

        Player.info();
        for (int i = 0; i < 100; i++)
            player4.run();
        for (int i = 0; i < 100; i++)
            player6.run();

        Player.info();

        Player player8 = new Player(95);

        Player.info();

    }
}
