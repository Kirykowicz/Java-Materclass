package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] exampleArray = readIntegers();
        System.out.println(Arrays.toString(exampleArray));
        reversArray(exampleArray);
        System.out.println(Arrays.toString(exampleArray));
        System.out.println("The min value is: " + findMin(exampleArray));
        int[] ex = {1,2,3,4,5};

    }

    private static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int item : array){
            if(item < min){
                min = item;
            }
        }
        return min;
    }

    private static void reversArray(int[] arr){
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
