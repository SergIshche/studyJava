package day18;

public class Task2 {
    public static void main(String[] args) {

        System. out . println ( count7 ( 717771237 ));

    }

    private static int count7(int number){
        if (number == 0)
            return 0;
        int count = 0;
        if (number % 10 == 7)
            count++;
        return count + count7(number / 10);
    }
}
