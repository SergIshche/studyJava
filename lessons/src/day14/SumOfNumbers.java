package day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        File file = new File ("fileForDay14.txt");

        try {
            printSumDigits(file);

        } catch (FileNotFoundException e){
            System.out.println("File not found, please recheck");
        } catch (IllegalArgumentException e){
            System.out.println("Count not 10");
        }

    }

    public static void printSumDigits(File file) throws FileNotFoundException, IllegalArgumentException {

        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");

        if (numbersString.length != 10) {
            throw new IllegalArgumentException();
        }

        int suma = 0;

        for(String number : numbersString) {
            suma += Integer.parseInt(number);
        }
        System.out.println("Sum of numbers:" + suma);

    }
}
