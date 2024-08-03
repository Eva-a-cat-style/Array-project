package main;

import java.util.Arrays;
import java.util.Random;


public class App {
    static int[] number;
    static int negativeNumbers;
    static int biggestIndex;
    static int count;
    static int sumOfNumbers;
     static double averageNumber;
     static double even;
     static double unEven;
     static double smaller;
     static double biggest;
     static double smallerIndex;
     static boolean firstNegativeNumber;


     public static void main(String[] args) {
        number = new int[20];
        Random random = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(-101, 101);
        }
        System.out.println("1) The random arrays: " + Arrays.toString(number));

        negativeNumbers = 0;

        for (int i : number) {
            if (i < 0) {
                negativeNumbers += i;
            }
        }
        System.out.println("2) Sum of negative numbers in the array is : " + negativeNumbers);

        even = 0;
        unEven = 0;

        for (int j : number) {
            if (j % 2 == 0) {
                even++;
            } else {
                unEven++;
            }
        }
        System.out.println("3) Even numbers in the array is : " + even +
                "\n   Uneven numbers in the array is : " + unEven);

        smaller = 0;
        biggest = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < smaller) {
                smaller = number[i];
                smallerIndex = i;
            }
            if (number[i] > biggest) {
                biggest = number[i];
                biggestIndex = i;
            }
        }
        System.out.println("4) The lowest element is : " + smaller +
                " and its index is : " + smallerIndex + "\n   The biggest element is : " +
                biggest + "and its index is : " + biggestIndex);

        sumOfNumbers = 0;
        count = 0;
        firstNegativeNumber = false;

        for (int a : number) {
            if (a < 0) {
                firstNegativeNumber = true;
            } else if (firstNegativeNumber) {
                sumOfNumbers += a;
                count++;
            }
        }
        if (count > 0){
            averageNumber = (double) sumOfNumbers / count;
            System.out.printf("5) Average number is : %.2f%n", averageNumber);
        } else {
            System.out.println(" Sorry but first negative number is not found");
        }
    }
}
