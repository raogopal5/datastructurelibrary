package com.practice;

import java.util.ArrayList;

public class CombinationsArraySum {
    static void Rec(int N, int K, ArrayList<Integer> temp,
                    boolean[] visited, ArrayList<ArrayList<Integer>> result,
                    int last)
    {

        // Base case
        if (N == 0 && K == 0)
        {

            result.add(new ArrayList<>(temp));
            return;
        }

        if (N <= 0 || K <= 0)
            return;

        // Traverse the range [1, 9]
        for(int i = last; i <= 9; i++)
        {

            if (!visited[i])
            {

                // Mark i visitedited
                visited[i] = true;

                // Push i into the vector
                temp.add(i);

                // Recursive call
                Rec(N - 1, K - i, temp, visited,
                        result, i + 1);

                // Pop the last element
                // from temp
                temp.remove(temp.size() - 1);

                // Mark i unvisitedited
                visited[i] = false;
            }
        }
    }

    // Function to check if required
// combination can be obtained or not
    static void combinationSum(int N, int K)
    {

        // If N * 9 is less than K
        if (N * 9 < K)
        {
            System.out.print("Impossible");
            return;
        }

        // Stores if a number can
        // be used or not
        boolean[] visited = new boolean[10];

        ArrayList<Integer> temp = new ArrayList<>();

        // Stores list of all the
        // possible combinations
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Rec(N, K, temp, visited, result, 1);

        // Print the result[][] array
        for(int i = 0; i < result.size(); i++)
        {
            for(Integer x : result.get(i))
                System.out.print(x + " ");

            System.out.println();
        }
        return;
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 3, K = 9;

        combinationSum(N, K);
    }
}
