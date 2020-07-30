package com.set_1.go.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Program to get the character count and max and min occurrences
public class CharacterCount {
    private static List<Character> maxCharacterList=new ArrayList<>();
    private static List<Character> minCharacterList=new ArrayList<>();

    public static void main(String[] args) {
        String input="Grass is greener on the other side ";
        Map<Character,Integer> characterCount=getCharacterCount(input);
        int maxValue=0;
        int minValue=0;
        for (Map.Entry<Character,Integer> entry:characterCount.entrySet()) {
            if(minValue==0){
                minValue=entry.getValue();
            }
            if(maxValue < entry.getValue()){
                maxValue=entry.getValue();


            }
            if(minValue > entry.getValue()){
                minValue=entry.getValue();

            }
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }

        getMaxAndMinCharactersList(characterCount,maxValue,minValue);

        System.out.println("Minimum Occurences");
        for (Character c:minCharacterList) {
            System.out.print( c +" ");
        }
        System.out.println();
        System.out.println("Maximum Occurences");
        for (Character c:maxCharacterList) {
            System.out.print( c +" ");
        }
    }

    public static void getMaxAndMinCharactersList(Map<Character,Integer> characterCount,int maxValue, int minValue){
        for (Map.Entry<Character,Integer> entry:
                characterCount.entrySet()) {
            if(entry.getValue()==maxValue){
                maxCharacterList.add(entry.getKey());
            }
            if(entry.getValue()==minValue){
                minCharacterList.add(entry.getKey());
            }

        }
    }

    public static Map<Character,Integer> getCharacterCount(String input){
        char[] inputArray=input.toCharArray();
        Map<Character,Integer> characterCount=new HashMap<>();
        for (Character c:inputArray) {
            if(c!=null && c.toString().trim().length()==0){
                continue;
            }
            if(characterCount.get(c) == null){
                characterCount.put(c,1);
            }else{
                Integer currentCount=characterCount.get(c);
                characterCount.put(c,currentCount+1);
            }
        }
        return characterCount;
    }
}
