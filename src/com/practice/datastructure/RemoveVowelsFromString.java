package com.practice.datastructure;

public class RemoveVowelsFromString {

    public static void removeVowelsFromString(String vowels){

        for(int i=0;i<vowels.length();i++){
            char ch = vowels.charAt(i);

            if(ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                continue;
            }
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        removeVowelsFromString(" welcome to java union");
    }
}
