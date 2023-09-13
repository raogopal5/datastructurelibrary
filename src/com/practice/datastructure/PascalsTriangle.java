package com.practice.datastructure;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    static int factorial(int n) {
        int f;

        for(f = 1; n > 1; n--){
            f *= n;
        }
        return f;
    }
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }

    public static void printPascal(int A)
    {
        for (int line = 1; line <= A; line++) {
            for (int j = 0; j <= A - line; j++) {

                // for left spacing
                System.out.print(" ");
            }

            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {

                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        int[][] dp = new int[numRows][numRows];

        for (int i = 0; i < numRows; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;

            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(dp[i][j]);
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static int[][] binomialTriangle(int A) {


        // an array of 'n' rows
        int[][] arr = new int[A][];
        // iterate over the rows of the array
        for (int i = 0; i < A; i++) {
            // a row of 'n-i' elements
            arr[i] = new int[A - i];
            // iterate over the elements of the row
            for (int j = 0; j < A - i; j++) {
                if (i == 0 || j == 0) {
                    // elements of the first row
                    // and column are equal to one
                    arr[i][j] = 1;
                } else {
                    // all other elements are the sum of the
                    // previous element in the row and column
                    arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
                }
            }
        }
        return arr;
    }



    public static void main(String args[]){
        System.out.println();
        int n, i, j;
        n = 5;

        for(i = 0; i <= n; i++) {
            for(j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                System.out.print(" "+ncr(i, j));
            }
            System.out.println();
        }
    }
}
