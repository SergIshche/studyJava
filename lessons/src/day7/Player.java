package day7;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }
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
