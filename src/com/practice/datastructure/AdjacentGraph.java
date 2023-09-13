package com.practice.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacentGraph {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<List<Integer>> listGraph = new ArrayList<>();

        for(int i=0;i<n;i++) {

            listGraph.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++) {

            int u = scanner.nextInt();
            int v = scanner.nextInt();

            listGraph.get(u).add(v);
            listGraph.get(v).add(u);
        }

        System.out.println(listGraph);


        int noOfNodes = 10;
        int noOfEdges = 20;

        int graph [][] = new int[n][n];

        for(int i=0;i<m;i++){

            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph[u][v] =1;
            graph[v][i] =1;
        }
    }
}
