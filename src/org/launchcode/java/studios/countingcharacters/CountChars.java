package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args){
        String sentence = "Hi, I'm Dave";
        characterCount(sentence);
    }
    static void characterCount(String words){
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        char[] charArr = words.toCharArray();

        for(char c : charArr) {
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for(Map.Entry entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
