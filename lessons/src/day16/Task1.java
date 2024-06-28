package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("avg.txt"));
    }

    public static void printResult(File file){

        List<Integer> integer = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] temp = line.split(" ");
                for (String str : temp)
                    integer.add(Integer.parseInt(str));
            }
            double result = 0;
            for (int list : integer) {
                result += list;
            }
            result = result / integer.size();
            System.out.println("Average: " + String.format("%.3f", result));

        } catch (FileNotFoundException e) {
            System.out.println("File not found, try again");
        }

    }
}
