package com.practice;

/**
 * Input: S = “abababa”, S1 = “aba”, S2 = “a”
 * Output: aba
 * Explanation:
 * Change the substrings S[0, 2] and S[4, 6](= S1) to the string S2(= “a”) modifies the string S to “aba”. Therefore, print “aba”.
 *
 * Input: S = “geeksforgeeks”, S1 = “eek”, S2 = “ok”
 * Output: goksforgoks
 */
public class StringReplaceAlo {

    static void modifyString(String s, String s1, String s2)
    {
        // Stores the resultant String
        String ans = "";

        // Traverse the String s
        for (int i = 0; i < s.length(); i++) {

            int k = 0;

            // If the first character of
            // String s1 matches with the
            // current character in String s
            if (s.charAt(i) == s1.charAt(k)
                    && i + s1.length() <= s.length()) {

                int j;

                // If the complete String
                // matches or not
                for (j = i; j < i + s1.length(); j++) {

                    if (s.charAt(j) != s1.charAt(k)) {
                        break;
                    }
                    else {
                        k = k + 1;
                    }
                }

                // If complete String matches
                // then replace it with the
                // String s2
                if (j == i + s1.length()) {
                    ans += (s2);
                    i = j - 1;
                }

                // Otherwise
                else {
                    ans += (s.charAt(i));
                }
            }

            // Otherwise
            else {
                ans += (s.charAt(i));
            }
        }

        // Print the resultant String
        System.out.print(ans);
    }
    public static void main(String args[]){

        StringReplaceAlo.modifyString("geeksforgeeks","eek","ok");

    }

}
