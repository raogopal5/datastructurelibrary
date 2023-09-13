package com.practice.datastructure;

public class FibonacciUsingDynamicProgramming {
    public static int FibonacciUsingTopBottomApproach(int N,int [] dp){

        if(N==0 || N==1){
            return N;

        }

        if(dp[N] !=0){
            return dp[N];
        }

         int nm1 = FibonacciUsingTopBottomApproach(N-1,dp);
        int nm2 = FibonacciUsingTopBottomApproach(N-2,dp);

        dp[N] = nm1 + nm2;

        return  nm1 + nm2;

    }


    public static int FibonacciUsingTopDownApproach(int N,int [] dp){

        if(N==0 || N==1){
            return N;

        }

        if(dp[N] !=0){
            return dp[N];
        }

        int nm1 = FibonacciUsingTopDownApproach(N-1,dp);
        int nm2 = FibonacciUsingTopDownApproach(N-2,dp);

        dp[N] = nm1 + nm2;

        return  nm1 + nm2;

    }

    public static int FibonacciUsingBottomUpApproach(int N){

        int [] dp = new int[N+1];
        dp[0] =0;
        dp[1] =1;


     for(int i=2;i< dp.length;i++){
         dp[i] = dp[i-1] + dp[i-2];
     }

     return dp[dp.length-1];

    }

    public int [][] generate(int numRows) {
        int arr[][] = new int[numRows][numRows];

        for(int i=0; i<numRows; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || i==j){
                    arr[i][j] =1;
                }
                else{
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }

            }
        }
        for(int i=0; i<numRows; i++){
            for(int j=0; j<=i; j++){
                 arr[i][j]=2;
            }

        }

        return arr;
    }




    public static void main(String[] args) {
        int N =8;

        int dp [] = new int[N+1];

        int result = FibonacciUsingTopDownApproach(8,dp);
        System.out.println(result);



    }
}
