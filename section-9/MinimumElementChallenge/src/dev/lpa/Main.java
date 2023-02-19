package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] exampleArray = readIntegers();
//        System.out.println(Arrays.toString(exampleArray));
//        reverseArray(exampleArray);
//        System.out.println(Arrays.toString(exampleArray));
//        System.out.println("The min value is: " + findMin(exampleArray));
        int[] ex = {1,2,3,4,5};
//        int[] reversed = reverseCopy(ex);
        reverseCopyAlternateSolution(ex);
//        System.out.println(Arrays.toString(reversed));

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

    private static void reverseArray(int[] arr){
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private static void reverseArrayInstructorsSolutions(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    private static int[] reverseCopy(int[] array){
        int[] newArray = Arrays.copyOf(array, array.length);
        reverseArrayInstructorsSolutions(newArray);
        return newArray;
    }

    private static int[] reverseCopyAlternateSolution(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int el : array){
            reversedArray[maxIndex--] = el;
            System.out.println(maxIndex);
        }
        return reversedArray;
    }
}
