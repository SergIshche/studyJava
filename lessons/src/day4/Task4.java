package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int numLength = 100;

        Random rand = new Random();
        int[] numbers = new int[numLength];

        for (int i = 0; i < numLength; i++)
            numbers[i] = rand.nextInt(10000);

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int maxSum = 0;
        int indx = 0;
        for (int i = 1; i < numbers.length - 2; i++){
            int sum = 0;
            for (int j=i; j< i + 3; j++){
                sum += numbers[j];
            }
            if (sum > maxSum){
                maxSum = sum;
                indx = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(indx);
        System.out.println(numbers[indx]);
    }
}
