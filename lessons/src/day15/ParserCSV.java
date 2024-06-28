package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParserCSV {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> result = parseFileToTXT();
        if (result != null) {
            for (String line : result) {
                System.out.println(line);
            }
        }
    }

    public static List<String> parseFileToTXT() throws FileNotFoundException {
        File csv = new File("csv.csv");
        File txt = new File("txt.txt");
        PrintWriter pw = new PrintWriter(txt);

        List<String> goods = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(csv);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] goodstemp = line.split(";");
                if (Integer.parseInt(goodstemp[2]) == 0) {
                    goods.add(line);
                }
            }

            for (String good : goods) {
                pw.println(good);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found, try again");
        } finally {
            pw.close();
        }

        return goods;
    }
}
