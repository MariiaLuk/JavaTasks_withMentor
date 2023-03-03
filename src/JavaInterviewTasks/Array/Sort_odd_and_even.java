package JavaInterviewTasks.Array;

import java.util.Arrays;

public class Sort_odd_and_even {

    public static void main(String[] args) {

        int[] array = {6,26,19,53,42,6,13,44};

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                for (int j = i+1; j < array.length; j++) {
                    int temp = 0;
                    if(array[j] % 2 ==0){
                        temp = array[i];
                        array[i] = array[j];
                        array[j]= temp;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(array));



    }


}
