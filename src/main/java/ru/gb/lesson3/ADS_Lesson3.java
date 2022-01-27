package ru.gb.lesson3;

/**
 * 1. Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен (предыдущий + 1). Но в массиве гарантированно 1 число пропущено. Необходимо вывести на экран пропущенное число.
 * Примеры:
 * [1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16] => 11
 * [1, 2, 4, 5, 6] => 3
 * [] => 1
 */

public class ADS_Lesson3 {

    public static int arrayTest(int[] array, int min, int max) {
        int mid = (min + max) / 2;
        if (array.length == 0 || array[0] == 2) {
            System.out.println(1);
            return 1;
        }
        if (mid == min) {
            System.out.println(array[mid] + 1);
            return array[mid] + 1;
        }

        if ((mid + 1) == array[mid])
            return arrayTest(array, mid, max);
        else
            return arrayTest(array, min, mid);
    }

    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] testArray2 = {1, 2, 4, 5, 6};
        int[] testArray3 = {};
        arrayTest(testArray1, 0, testArray1.length);
        arrayTest(testArray2, 0, testArray2.length);
        arrayTest(testArray3, 0, testArray3.length);
    }
}
