package com.practice.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraverse {

    public static void bfs (List<List<Integer>> graph,int src){
        Queue<Integer> queue = new LinkedList<>();
        boolean visitedArray [] = new boolean[graph.size()];

        queue.add(src);
        visitedArray[src] = true;

        while (queue.size() >0){
            int rem = queue.remove();
            System.out.println(rem);
            //all the neighbors
            List<Integer> nbrs = graph.get(rem);

            for(Integer nbr : nbrs){
                if(visitedArray[nbr]==false){
                    queue.add(nbr);
                    visitedArray[nbr] = false;
                }
            }
        }


    }
    public static void main(String[] args) {


    }
}
