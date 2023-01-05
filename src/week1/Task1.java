package week1;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));

    }

    public static String identify(int number){
        if(number %2 == 0){
            return "Even";
        }
        return "Odd";
    }

}



/*
write a method which can identify given number is even or odd

ex

identify(5) -> "Odd"
identify(6) -> "Even"
 */