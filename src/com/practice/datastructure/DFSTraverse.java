package com.practice.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSTraverse {

    public static void DFS(ArrayList<ArrayList<Integer>> graph,int src,boolean [] vis){

      vis[src]  = true;
        Queue<Integer> queue = new LinkedList<>();

      ArrayList<Integer> nbrs = graph.get(src);

      for(Integer nbr : nbrs){
          if(vis[nbr] ==false){
              DFS(graph,nbr,vis);
          }

      }


    }

    public static void main(String[] args) {


    }
}
