package week4;

import java.util.Arrays;

public class Task2_SameLetters {

    public static void main(String[] args) {

        System.out.println(same("abc","cab"));
        System.out.println(same("abc","abb"));

    }

    public static boolean same(String str1 , String str2){
        String[] array1 = str1.split("");
        String[] array2 = str2.split("");

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }

}

/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */