package com.yoyiyi.dplearning.interator;

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * @date 创建时间：2019/4/27 11:37
 * 描述: 具有迭代功能的猫窝类
 */
public class CatNest implements IAggregate {
    private Cat[] cats;
    private int last = 0;

    public CatNest(int maxSize) {
        this.cats = new Cat[maxSize];
    }

    public Cat getCatAt(int index) {
        return cats[index];
    }

    public void appendCat(Cat cat) {
        this.cats[last] = cat;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new CatNestIterator(this);
    }
}
