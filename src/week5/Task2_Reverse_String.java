package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2_Reverse_String {
    //String -- Reverse
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
        System.out.println(reverse2("ABCD"));

    }
    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }

    //version using collections
    public static String reverse2(String str){
        String result = "";

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(list);
        for (String each : list) {
            result+=each;
        }
        return result;
    }
}
