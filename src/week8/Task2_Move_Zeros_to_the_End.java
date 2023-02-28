package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2_Move_Zeros_to_the_End {

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeros_FirstSolution(arr)));
        System.out.println(Arrays.toString(moveZeros_SecondSolution(arr)));
        System.out.println(Arrays.toString(moveZeros_ThirdSolution(arr)));
    }
    
    public static int[] moveZeros_FirstSolution(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i]==0){
                    array[i] = array[j];
                    array[j] = 0;
                }
            }
        }
        return array;
    }

    public static int[] moveZeros_SecondSolution(int[] array) {
        List<Integer> list = new ArrayList<>();
        int countZeros = 0;
        for (int each : array) {
            if(each == 0){
                countZeros++;
            }else {
                list.add(each);
            }
        }

        for (int i = 0; i < countZeros; i++) {
            list.add(0);
        }


        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static int[] moveZeros_ThirdSolution(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0) {
                result[count++] = each;
            }
        }

        return result;

    }

    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
     */

}
