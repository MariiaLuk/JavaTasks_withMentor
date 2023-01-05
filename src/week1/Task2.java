package week1;

public class Task2 {
    public static void main(String[] args) {

        divide(10,5);
        divide(15,3);
        divide(0,5);
        divide(6,5);
       // divide(5,0);

    }

    public static void divide(int num1, int num2){
        int first = num1;
        if( num1 < num2 && num1 != 0 ){
            throw new ArithmeticException("Invalid numbers. Please provide num1 bigger than num2");
        }else if(num2 == 0 ){
            throw new ArithmeticException("Unable to divide by 0. Please provide different number");
        }else if( num1 == 0){
            System.out.println(num1 + " divided by "+ num2 + " will be "+ 0);
            return;
        }
        int count = 0;
        while(num1 >= num2){
            num1 = num1 - num2;
            count++;
        }
        System.out.println(first+" divided by "+ num2 + " will be "+ count + " with remainder of "+ num1);

    }
}


/*
Divide without / operator

write a method that can divide two numbers without using division operator
 */