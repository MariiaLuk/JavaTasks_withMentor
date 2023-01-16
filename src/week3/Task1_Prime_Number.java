package week3;

public class Task1_Prime_Number {
    public static void main(String[] args) {

        System.out.println(isPrime(29));
        System.out.println(isPrime(3));
        System.out.println(isPrime(10));
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
          if(num % i == 0){
              return false;
          }
        }
        return true;
    }
}


/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */