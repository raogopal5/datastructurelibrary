package com.practice.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JumpIteratorExample implements Iterator {

    private Iterator<Integer> it;
    private boolean skipped;

    public JumpIteratorExample(List<Integer> list){
        it = list.iterator();
        skipped = false;
        // if you want to take the first value from the stream,
        // change skipped to true
    }

    @Override
    public boolean hasNext() {
        if (it.hasNext() && !skipped) {
            it.next();
            skipped = true;
        }
        return it.hasNext();
    }

    @Override
    public Integer next() {
        if (!skipped) {
            it.next();
        }
        skipped = false;
        return it.next();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        JumpIteratorExample j = new JumpIteratorExample(arrayList);
        System.out.println(j.next());
        System.out.println(j.next());
        System.out.println(j.next());


    }
}
