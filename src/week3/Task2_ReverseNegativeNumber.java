package week3;

public class Task2_ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseNegative(-50));
        System.out.println(reverseNegative(-3));
        System.out.println(reverseNegative(-30));
        System.out.println(reverseNegative(80));

    }

    public static int reverseNegative(int num){
        if(num > 0 ){
            throw new ArithmeticException("Given number is not a negative number");
        }
        return num*(-1);
    }
}


/*
2. Numbers -- Reverse negative number
Write a return method that can reverse negative number and return it as int
 */