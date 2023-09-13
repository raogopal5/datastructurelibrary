package com.practice;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateChar {

    private Map<Character,Integer> duplicateChar(String str){

        char charValue [] = str.toCharArray();
        Map<Character,Integer> countMap = new HashMap<>();

        for(char variable : charValue){

            if(countMap.containsKey(variable)){
                countMap.put(variable,countMap.get(variable)+1);
            }else{
                countMap.put(variable,1);
            }
        }

      return  countMap;
    }

    public static  void main(String args[]){

        PrintDuplicateChar printDuplicateChar = new PrintDuplicateChar();
         Map<Character,Integer> duplicateMapPrint  = new HashMap<>();

        duplicateMapPrint = printDuplicateChar.duplicateChar("madam");
         for(Map.Entry mapTpPrint: duplicateMapPrint.entrySet() ){

             System.out.println(mapTpPrint.getKey() + "----" + mapTpPrint.getValue());
         }

    }
}
