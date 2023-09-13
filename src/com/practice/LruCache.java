package com.practice;

import java.util.*;

public class LruCache {


    private final int CACHE_SIZE;


    private Deque<Integer> cacheDoubleQueue;
    private HashSet<Integer>  cacheSet;

    HashMap map;

    private LinkedList<Integer> list;

     LruCache(int cacheSize) {
         CACHE_SIZE =cacheSize;
        cacheDoubleQueue = new LinkedList<>();
        cacheSet = new HashSet<>();
    }

    public void refer(int page){

         if(!cacheSet.contains(page)){
             if(cacheDoubleQueue.size()==CACHE_SIZE) {
                 int last = cacheDoubleQueue.removeLast();
                 cacheSet.remove(last);
             }
         }else{
        /* The found page may not be always the last
                element, even if it's an intermediate
                element that needs to be removed and added
                to the start of the Queue */
             cacheDoubleQueue.remove(page);
         }
         cacheSet.add(page);
         cacheDoubleQueue.push(page);
    }

    public void refer1(int page,Object key,Object value){

        if(!cacheSet.contains(page)){
            if(list.size()==CACHE_SIZE) {
                int last = cacheDoubleQueue.removeLast();
                map.remove(last);
            }
        }else{
        /* The found page may not be always the last
                element, even if it's an intermediate
                element that needs to be removed and added
                to the start of the Queue */
            list.remove(page);
        }
        list.addFirst(page);
        map.put(key,value);
    }

    public void referForMRU(int page){

        if(!cacheSet.contains(page)){
            if(list.size()==CACHE_SIZE) {
                int last = list.removeLast();
                map.remove(last);
            }
        }else{
        /* The found page may not be always the last
                element, even if it's an intermediate
                element that needs to be removed and added
                to the start of the Queue */
            list.remove(page);
        }
        list.addLast(page);
        cacheDoubleQueue.push(page);
    }

    public void display(){

        Iterator<Integer> itr  = cacheDoubleQueue.iterator();
        while (itr.hasNext()){

            System.out.println(itr.next() + "----" );
        }
    }

    public static void main(String args[]){
         LruCache lruCache = new LruCache(4);
         lruCache.refer(1);
         lruCache.refer(2);
         lruCache.refer(3);
         lruCache.refer(4);
         lruCache.refer(5);
         lruCache.refer(6);

         lruCache.display();


    }

}
