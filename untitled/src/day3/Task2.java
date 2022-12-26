package day3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b ");

        while(true) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            if (b == 0)
                break;
            double res = a/b;
            System.out.println(res);
        }
    }
}

