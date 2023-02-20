package week7;

import java.util.Arrays;

public class Task1_Array_FindMinimum {
    /*
    Question1: Array - Find Minimum
    Write a method that can find the minimum number from an int Array
     */

    public static void main(String[] args) {
        int[] array = {5,78,96,-5,756,39};
        System.out.println(findMinimum(array));
        System.out.println(findMin_ArraysMethod(array));
    }


    public static int findMinimum(int[] array){
        int min = array[0];

        for (int each : array) {
            if(each<min){
                min = each;
            }
        }
        return min;
    }

    public static int findMin_ArraysMethod (int[] array){
        Arrays.sort(array);
        return array[0];
    }

}
