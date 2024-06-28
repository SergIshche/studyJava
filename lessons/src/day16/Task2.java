package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File randomNumbers = new File("1.txt");

        PrintWriter pw = new PrintWriter(randomNumbers);

        Random rand = new Random();
        int numLength = 1000;
        for (int i = 0; i < numLength; i++) {
            pw.println(rand.nextInt(100));
        }

        pw.close();

        File sortedNumbers = new File("2.txt");
        Scanner scanner = new Scanner(randomNumbers);
        PrintWriter pw2 = new PrintWriter(sortedNumbers);
        int count = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            count++;

            if (count == 20) {
                pw2.println(sum / 20.0);

                count = 0;
                sum = 0;
            }
        }
        pw2.close();
        printResulAverage(new File("2.txt"));
    }

    private static void printResulAverage(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        double sum = 0;
        while (scanner.hasNextLine()) {
            sum += Double.parseDouble(scanner.nextLine());
        }

        System.out.println((int) sum);

    }
}
