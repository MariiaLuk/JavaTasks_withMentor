package week8;

import java.util.Arrays;

public class Task1_Array_N_Unique_Integers {

    public static void main(String[] args) {
        int[] result = giveArray(3);
        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(solution(4)));
    }


    public static int[] giveArray(int length)  {
        if(length<1 || length>100){
            System.out.println("Provided number is out of range");
        }
        int[] array = new int[length];
        if(length %2 == 0){
            for (int i = 0 , j = 1 ; i < array.length; i+=2 ,j++) {
                array[i]= j;
                array[i+1] = -j;
            }
        }else {
            array[0] = 0;
            for (int i = 1 , j = 1 ; i < array.length; i+=2 ,j++) {
                array[i]= j;
                array[i+1] = -j;
            }
        }
        return array;
    }

    //CYDEO RESOLUTION
    public static int[] solution(int N) {

        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }

        result[N - 1] = -sum;

        return result;
    }
    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
     */
}
