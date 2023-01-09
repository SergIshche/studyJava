package day4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number ");
        int numLength = scan.nextInt();

        Random rand = new Random();
        int[] numbers = new int[numLength];

        for (int i = 0; i < numLength; i++)
            numbers[i] = rand.nextInt(10);

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int count8 = 0;
        for( int x:numbers){
            if(x>8)
                count8++;
        }
        System.out.println(count8);

        int count1 = 0;
        for( int x:numbers) {
            if (x == 1)
                count1++;
        }
        System.out.println(count1);

        int countEven = 0;
        for( int x:numbers){
            if(numbers[x] % 2 == 0 && numbers[x] != 0)
                countEven++;
        }
        System.out.println(countEven);

        int countOdd = 0;
        for( int x:numbers){
            if(numbers[x] % 2 != 0)
                countOdd++;
        }
        System.out.println(countOdd);

        int sumOfArray = 0;
        for( int x:numbers){
                sumOfArray += x ;
        }
        System.out.println(sumOfArray);
    }
}
