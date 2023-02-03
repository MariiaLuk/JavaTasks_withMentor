package week3;

public class Task2_ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseNegative(-58946));
        System.out.println(reverseNegative(-3));
        System.out.println(reverseNegative(-1234));
        System.out.println(reverseNegative(87));

    }

    public static int reverseNegative(int num){
        int reversed = 0;
        if(num>0){
            throw new ArithmeticException("Provided number is not a negative number");
        }else {
            num = - num;
        }
        while (num != 0 ){
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /=10;
        }
        return reversed;
    }
}


/*
2. Numbers -- Reverse negative number
Write a return method that can reverse negative number and return it as int
 */