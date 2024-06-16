package day7;

import java.util.Random;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player() {

        if (countPlayers < 6) {
            countPlayers++;
        }

        Random rand = new Random();
        this.stamina = rand.nextInt(11) + 90;
    }

    public void run() {
        if (stamina == 0)
            return;
        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Not enough players. There are " + (6 - countPlayers) + " free place");
        } else {
            System.out.println("There is no a free place");
        }
    }
}
