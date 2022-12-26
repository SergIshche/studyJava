package day3;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter city ");

        while(true) {
            String x = s.nextLine();

            if (x.equals("stop"))
                break;

            switch(x) {
                case "London", "Milan", "Verona":
                    System.out.println("England");
                    break;
                case "Kyiv", "BC", "Lviv":
                    System.out.println("Ukraine");
                    break;
                default:
                    System.out.println("Wrong data");
            }
        }
    }
}

