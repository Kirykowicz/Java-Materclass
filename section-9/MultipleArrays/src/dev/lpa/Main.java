package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer: array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.println(array2[i][j]);
                array2[i][j] = random.nextInt(100);
            }
//            System.out.println();
        }

//        for(var outer : array2){
//            for(var element : outer){
//                System.out.print(element + " ");
//            }
//        }
        System.out.println(Arrays.deepToString(array2));

        int[][] array3 = new int[4][];
        array3[1] = new int[]{10, 20, 30};
        array3[0] = new int[]{11, 22, 33, 44};
        System.out.println(Arrays.deepToString(array3));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new Dog();
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = "Hello World";
        System.out.println(Arrays.deepToString(anyArray));
    }
}
