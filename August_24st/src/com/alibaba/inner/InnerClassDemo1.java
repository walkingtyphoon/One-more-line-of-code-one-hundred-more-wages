package com.alibaba.inner;

import org.junit.Test;

/**
 * .
 * 内部类
 * 按照位置分类：
 * 1、成员内部类
 * 2、局部内部类(匿名内部类)
 * <p>
 * 按照修饰权限：
 * 1、private 修饰的
 * 2、static 修饰的
 */
public class InnerClassDemo1 {

    @Test
    public void show() {
        // 此时无法访问内部类的数据
    }
}

class InnerClassDemo2 {

    @Test
    public void test() {
        // 在内部类使用私有的构造器，调用展示的方法
        new InnerClassDemo3().show();
    }

    /**
     * .
     * 创建私有的内部类
     */
    private class InnerClassDemo3 {

        /**
         * .
         * 用于测试的内部类展示方法
         */
        public void show() {
            System.out.println("这是私有内部类的方法");
        }
    }

}
