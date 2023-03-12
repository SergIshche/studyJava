package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder digitalToString = new StringBuilder("");

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 2000; i++)
            digitalToString.append(i).append(" ");

        long after = System.currentTimeMillis();

            System.out.println("StringBuilder:" + (after - before));
            System.out.println(digitalToString);


        String digital = "";

        before = System.currentTimeMillis();

        for (int i = 0; i <= 2000; i++)
            digital += i + " ";

        after = System.currentTimeMillis();

        System.out.println("String:" + (after - before));
        System.out.println(digital);



    }
}
