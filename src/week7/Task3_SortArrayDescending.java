package week7;

import java.util.Arrays;

public class Task3_SortArrayDescending {
    /*
    Question3: Array - Sort Descending
        Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        Ex: int[] arr = {10,20,7, 8, 90};
         arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {
        int[] array = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortDesc(array)));
    }
    public static int[] sortDesc(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int temp = 0;
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i]= array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
