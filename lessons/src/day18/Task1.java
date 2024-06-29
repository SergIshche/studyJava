package day18;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = { 1 , 10 , 1241 , 50402 , - 500 , 249 , 10215 , 665 , 2295 , 7 , 311, 84889 };

        System.out.println(recursionSum(numbers, 0));

    }
    private static int recursionSum(int[] numbers, int i){
        if (i == numbers.length)
            return 0;
        return numbers[i] + recursionSum (numbers, i+1);

    }

}
