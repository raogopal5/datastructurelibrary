package com.practice.datastructure;

public class MinimumSum {





        public int recursion (int grid[][],int i,int j,int dp[][])
        {
            if (i==grid.length-1 && j==grid[0].length-1)
            {
                return grid[i][j];
            }
            if (i>=grid.length ||j>=grid[0].length)
            {
                return (int)1e9;
            }
            if (dp[i][j]!=-1) return dp[i][j];
            int choice1=grid[i][j]+recursion (grid,i+1,j,dp);
            int choice2=grid[i][j]+recursion (grid,i,j+1,dp);
            return dp[i][j]=Math.min (choice1, choice2);
        }
        public int minPathSum(int[][] grid)
        {
            int dp[][]=new int [grid.length][grid[0].length];
            for (int i=0;i<grid.length;i++)
            {
                for (int j=0;j<grid[0].length;j++)
                {
                    dp[i][j]=-1;
                }
            }
            return recursion (grid,0,0,dp);

        }



}
