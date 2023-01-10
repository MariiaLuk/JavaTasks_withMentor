package week2;

public class Task2 {
    public static void main(String[] args) {

        String DivisibleBy15 = "Divisible By 15: ";
        String DivisibleBy5 = "Divisible By 5: ";
        String DivisibleBy3 = "Divisible By 3: ";

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                DivisibleBy15 += i + " ";
            }else if(i % 3 == 0){
                DivisibleBy3 += i + " ";
            }else if( i % 5 == 0){
                DivisibleBy5 += i + " ";
            }
        }

        System.out.println(DivisibleBy15);
        System.out.println(DivisibleBy5);
        System.out.println(DivisibleBy3);



    }
}


/*
write a program that can print the numbers between 1 ~ 100 that can be divisible by 3,5 and 15
if the number can be divisible by 3, 5 and 15 then it should only be displayed in DivisibleBy15 section
if the number can be divisible by 3 but can not be divisible by 15 then it should only be displayed in DivisibleBy3 section
if the number can be divisible by 5 but can not be divisible by 15 then it should only be displayed in DivisibleBy5 section
 */