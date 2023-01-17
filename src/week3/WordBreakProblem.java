package week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordBreakProblem {
    public static void main(String[] args) {
        String[] dictionary = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};

        System.out.println("Please enter your word");
        String input = new Scanner(System.in).next();

        /*String result = "no";
        for (int i = 1; i <= input.length(); i++) {
            if (dictionary.contains(input.substring(0, i)) &&
                    dictionary.contains(input.substring(i))) {
                result = "yes";
            }
        }

        System.out.println(result);

         */


        String temp = "";

        for (int i = 0; i < dictionary.length; i++) {
            if(input.contains(dictionary[i])){
                temp += dictionary[i];
                if(input.equals(temp)){
                    break;
                }
            }
        }
        System.out.println(input);
        System.out.println(temp);

        if(input.equals(temp)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }



    }

}


/*
4.    Word Break Problem
    Given an input string and a dictionary of words, find out if the input string can be segmented
    into a space-separated sequence of dictionary words. See following examples for more details.
    This is a famous Google interview question, also being asked by many other companies now a days.
    Consider the following dictionary
        { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
        Input:  ilike
        Output: Yes
        The string can be segmented as "i like".
        Input:  ilikesamsung
        Output: Yes
        The string can be segmented as "i like samsung" or "i like sam sung".
 */