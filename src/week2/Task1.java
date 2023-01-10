package week2;

public class Task1 {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        System.out.println("Before swapping: a = "+ a+", b = "+ b);

        b = a + b; // 100 + 200 = 300
        a = b - a; // 300 - 100 = [a = 200]
        b = b - a; // 300 - 200 = [b = 100]

        System.out.println("After swapping: a = "+ a+", b = "+ b);



    }

}


/*
swap two variable values without using a third value

 */