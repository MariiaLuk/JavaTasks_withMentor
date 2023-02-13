package JavaInterviewTasks.Array;

public class SortArray {

    public static void main(String[] args) {

        int[] array = {5,10,9,45,60,1};

        int[] result = new int[array.length];

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
           if(array[i]<min){
               min = array[i];
           }
        }
        result[0] = min;


    }
}
