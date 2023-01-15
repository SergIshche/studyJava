package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int numLength = 100;

        Random rand = new Random();
        int[] numbers = new int[numLength];

        for (int i = 0; i < numLength; i++)
            numbers[i] = rand.nextInt(10000);

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);


        int large = 0;
        for (int element : numbers) {
            if (element > large)
                large = element;
        }
        System.out.println("The largest number of array = " + large);

        int small = 10000;
        for (int element : numbers) {
            if (element < small)
                small = element;
        }
        System.out.println("The smallest number of array = " + small);

        int count = 0;
        int sum = 0;
        for (int element : numbers) {
            if (element % 10 == 0)
                count ++;
                sum += element;
        }
        System.out.println("Number of array elements ending with 0 = " + count);
        System.out.println("Sum of array elements ending with 0 = " + sum);
    }
}
