package com.practice.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDirectPath {

    public boolean validPath(int n, int[][] edges, int sur, int dest) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visit= new boolean[n];
        Arrays.fill(visit,false);
        for(int[] arr:edges)
        {
            if(!map.containsKey(arr[0]))
            {
                List<Integer> list = new ArrayList<>();
                map.put(arr[0],list);
            }
            if(!map.containsKey(arr[1]))
            {
                List<Integer> list2= new ArrayList<>();
                map.put(arr[1],list2);
            }
            List<Integer> l1=map.get(arr[0]);
            l1.add(arr[1]);
            List<Integer> l2=map.get(arr[1]);
            l2.add(arr[0]);
            map.put(arr[0],l1);
            map.put(arr[1],l2);
        }
        return  fun(map,visit,sur,dest);


    }

    public boolean fun(HashMap<Integer,List<Integer>> map,boolean[] arr,int sur,int dest)
    {
        if(sur==dest)
            return true;
        arr[sur]=true;

        List<Integer> list = map.get(sur);
        // if(!list.isEmpty()) return ;
        for(int i=0;i<list.size();i++)
        { if(arr[list.get(i)]==false)
        {
            boolean ans= fun(map,arr,list.get(i),dest);
            if(ans==true) return true;
        }
        }

        return false;
    }

    public boolean solve(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph =new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }
        return dfs(graph,source, destination,new boolean[n]);
    }
    boolean dfs(ArrayList<Integer>[] graph , int src, int dest,boolean[] vis){
        if(src==dest) return true;
        vis[src]=true;
        for(int i=0; i<graph[src].size();i++){
            int e=graph[src].get(i);
            if(!vis[e]){
                if (dfs(graph,e, dest, vis)) {
                    return true;
                }
            }
        }
        return false;
    }


}
