package com.practice.datastructure;

public class StairDynamicProgramming {

    static int countWaysUtil(int n, int m)
    {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i <= m && i <= n; i++)
            res += countWaysUtil(n - i, m);
        return res;
    }

    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWaysUtil(s + 1, m);
    }

    static int fib(int n, int dp[])
    {
        if (n <= 1)
            return dp[n] = 1;

        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    // Returns number of ways to
    // reach s'th stair
    static int countWays(int n)
    {
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }
        fib(n, dp);
        return dp[n];
    }

    public static int climbStairUsingTopBottomUp(int N,int [] dp){

        if(N==1 || N==2){

            return N;
        }

        if(N==3){
            return 4;
        }

        if(dp[N] !=0){
            return dp[N];
        }

        int nm1 = climbStairUsingTopBottomUp(N-1,dp);
        int nm2 = climbStairUsingTopBottomUp(N-2,dp);
        int nm3 = climbStairUsingTopBottomUp(N-3,dp);

       dp[N] = nm1 +nm2 +nm3;

       return  nm1 +nm2 +nm3;

    }

    public static int climbStairUsingTopBottomUp(int N){

        int [] dp = new int[N+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=0;i<dp.length;i++){
            dp[N]  = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[dp.length-1];

    }

    /* Driver program to test above function */
    public static void main(String args[])
    {
        int s = 4, m = 2;
        System.out.println("Number of ways = "
                + countWays(s, m));
    }
}
