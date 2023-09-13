package com.practice.datastructure;

import java.util.Stack;

public class RemoveConsecutiveCharacterFromString {

    public static String removeDuplicates(String A, int B) {

        Stack<Character> charSt=new Stack<>();
        Stack<Integer> countSt=new Stack<>();

        for(char ch:A.toCharArray()){
            if(charSt.size()>0 && charSt.peek()==ch)
                countSt.push(countSt.peek()+1);
            else countSt.push(1);

            charSt.push(ch);
            if(countSt.peek()==B){
                for(int i=0;i<B;i++){
                    charSt.pop();
                    countSt.pop();
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        while(charSt.size()>0) sb.append(charSt.pop());
        return sb.reverse().toString();
    }

    public static String solve(String A, int B) {

        int i=0;
        int j=0;
        int n = A.length();
        String rs = "";
        String str = "";
        while(i<n && j<n){
            i=j;
            while(j<n && A.charAt(i) == A.charAt(j)){
                str+=A.charAt(j);
                j++;
            }
            if(str.length() != B){
                rs+=str;
            }
            str="";
        }
        return rs;
    }

    public String reverseStringByword(String A) {
        Stack<String> st = new Stack<>();
        String[] s = A.split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].equals("")){
                continue;
            }
            st.push(s[i]);
        }
        String strg = "";
        while(st.size()>1){
            String ss = st.pop();
            // if(ss.equals(" ")){continue;};
            strg += ss+" ";
        }
        strg+=st.pop();
        return strg;
    }

    public static void main(String[] args) {
       String  A = "abcddcbsa";
       int B = 2;
        String afterRemove = solve(A,B);
        System.out.println(afterRemove);

        String s1 = "one";

        String s2 = s1.concat("two");

        System.out.println(s2);

        String s = "Scaler Academy";

        System.out. println(s.substring(0,6));
    }
}
