package day3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b ");
        int counter = 0;
        while (counter < 5) {
            double a = s.nextDouble();
            double b = s.nextDouble();

            counter++;

            if (b == 0) {
                System.out.println("can`t be 0");
                continue;
            }

            System.out.println(a/b);
        }
    }
}
