package week6;

public class Task2_Array_FindMaximum {
    /*
    Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] array = {5,8,9,15,65,-87,-3335,9758};
        System.out.println(maxNumber(array));
    }

    public static int maxNumber(int[] array){
        int max = array[0];

        for (int each : array) {
            if(each>max){
                max = each;
            }
        }
        return max;
    }

}
