package com.practice.datastructure;

public class NFibonacci {
    static void printTrib(int A)
    {
        int dp[]=new int[A];
        dp[0] = dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i < A; i++)
            dp[i] = dp[i - 1] +
                    dp[i - 2] +
                    dp[i - 3];

        for (int i = 0; i < A; i++)
            System.out.print(dp[i] + " ");
    }

    static void printTrib1(int A)
    {
        if (A < 1)
            return;
        int first = 0, second = 0;
        int third = 1;

        System.out.print(first + " ");
        if (A > 1)
            System.out.print(second + " ");

        if (A> 2)
            System.out.print(second + " ");
        for (int i = 3; i < A; i++)
        {
            int curr = first + second + third;
            first = second;
            second = third;
            third = curr;

            System.out.print(curr +" ");
        }
    }

    public static void d(int A) {

        int[] dp = new int[A+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        A=0;
        A=1;

        for (int i = 3; i <= A; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        System.out.println( dp[A]);
    }

    static int printTribRec(int n, int[] dp)
    {
        if (n == 0 || n == 1 || n == 2)
            return 0;

        if (dp[n] != -1) {
            return dp[n];
        }

        if (n == 3)
            return 1;
        else
            return dp[n] = printTribRec(n - 1, dp)
                    + printTribRec(n - 2, dp)
                    + printTribRec(n - 3, dp);
    }



    // Driver code
    public static void main(String args[])
    {
        int n = 13;
        d(n);
    }


}
