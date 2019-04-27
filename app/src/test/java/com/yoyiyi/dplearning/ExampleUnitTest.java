package com.yoyiyi.dplearning;

import com.yoyiyi.dplearning.interator.Cat;
import com.yoyiyi.dplearning.interator.CatNest;
import com.yoyiyi.dplearning.interator.Iterator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    //1.迭代器模式
    @Test
    public void iterator() {
        CatNest catNest = new CatNest(2);
        catNest.appendCat(new Cat("橘猫"));
        catNest.appendCat(new Cat("白猫"));
        Iterator iterator = catNest.iterator();
        while (iterator.hasNext()) {
            Cat cat = (Cat) iterator.next();
            System.out.println(cat.getName());
        }
    }
}