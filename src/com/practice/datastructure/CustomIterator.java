package com.practice.datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomIterator<T> {

    private ArrayList<T> allitems ;
    public CustomIterator() {
        allitems = new ArrayList<T>() ;
    }
    public void add( T e) {
        allitems.add(e) ;
    }
    public Iterator<T> iterator(){
        return new MyIterator<T>() ;
    }
    public class MyIterator<T> implements Iterator<T> {
        private int index ;
        public MyIterator() {
            index=0 ;
        }
        @Override
        public boolean hasNext() {
            if(index >= allitems.size()) {
                return false ;
            }else {
                return true ;
            }
        }

        @Override
        public T next() {
            return (T) allitems.get( index++ ) ;
        }
    }
}
