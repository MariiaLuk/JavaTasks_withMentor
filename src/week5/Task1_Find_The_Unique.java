package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1_Find_The_Unique {
    //String -- Find the unique
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCCDEF"));
        System.out.println(uniqueChars2("AAABBBCCCDEF"));
    }


    public static String uniqueChars(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
            }
            if(frequency==1){
                result += ""+ str.charAt(i);
            }
        }

        return result;
    }

    //version using Collections

    public static String uniqueChars2(String str){
        String result = "";
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(p -> Collections.frequency(list,p)!=1);
        for (String each : list) {
            result += each;
        }
        return result;
    }


}
