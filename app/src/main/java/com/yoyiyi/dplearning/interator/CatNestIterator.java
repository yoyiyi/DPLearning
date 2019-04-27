package com.yoyiyi.dplearning.interator;

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * @date 创建时间：2019/4/27 11:35
 * 描述: 遍历猫窝的类
 */
public class CatNestIterator implements Iterator {
    private CatNest catNest;
    private int index;

    public CatNestIterator(CatNest catNest) {
        this.catNest = catNest;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < catNest.getLength();
    }

    @Override
    public Object next() {
        Cat cat = catNest.getCatAt(index);
        index++;
        return cat;
    }
}
