package com.practice.datastructure;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUUsingLinkedhashMap<K,V> extends LinkedHashMap<K,V> {

    private int size;

    public static void main(String[] args) {
        LRUUsingLinkedhashMap<Integer, Integer> cache = LRUUsingLinkedhashMap.newInstance(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 1);
        cache.put(3, 3);

        System.out.println(cache);
    }

    private LRUUsingLinkedhashMap(int size) {
        super(size, 0.75f, true);
        this.size = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }

    public static <K, V> LRUUsingLinkedhashMap<K, V> newInstance(int size) {
        return new LRUUsingLinkedhashMap<K, V>(size);
    }
}
