package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }
    public static List<HumanDay14> parseFileToObjList(){
        File file = new File ("people.txt");
        List<HumanDay14> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                HumanDay14 newperson = new HumanDay14(person[0], Integer.parseInt(person[1]));
                people.add(newperson);
            }

            return people;

        } catch (FileNotFoundException e) {
            System.out.println("File not found, try again");
        } catch (IllegalArgumentException e) {
            System.out.println("Age<0");
        }
        return null;
    }
}
