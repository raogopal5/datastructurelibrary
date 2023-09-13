package com.practice.datastructure;

public class SubtypeClassRule extends ParentClass{
    public void convert() {
        SubtypeClassRule b = new SubtypeClassRule();
        ParentClass h = new ParentClass();
        ParentClass bh = new SubtypeClassRule();
        ParentClass p = (SubtypeClassRule) b;
        SubtypeClassRule q = (ParentClass) h;
        SubtypeClassRule r = (SubtypeClassRule) bh;
        ParentClass s = (ParentClass) bh;
    }
}
