package day2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b ");
        int a = s.nextInt();
        int b = s.nextInt();
        int t = a + 1;

        if (a >= b) {
            System.out.println("Wrong input");
        }

        while (t < b) {
            if (t % 5 == 0 && t % 10 != 0) {
                System.out.println(t + "");
            }
            t++;
        }
    }
}