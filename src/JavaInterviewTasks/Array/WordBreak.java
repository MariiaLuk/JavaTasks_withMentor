package JavaInterviewTasks.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBreak {

        public static void main(String[] args) {

            String[] dictionary = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};

            String input = "ilikeapples";

            ArrayList<String> words = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                for (int j = i; j < input.length(); j++) {
                    String temp = input.substring(i, j+1);
                    if(Arrays.asList(dictionary).contains(temp) ){
                        if(!words.contains(temp)) {
                            words.add(temp);
                        }
                    }
                }
            }

            String result = (words.size() > 0) ? "YES" : "NO";

            System.out.println(words);
            System.out.println(result);
        }

    }

