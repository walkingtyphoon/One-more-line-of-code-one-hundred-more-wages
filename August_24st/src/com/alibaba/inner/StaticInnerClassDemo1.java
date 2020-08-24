package com.alibaba.inner;

/**
 * .
 * 静态内部类
 */
public class StaticInnerClassDemo1 {

    public static void main(String[] args) {
        // 静态内部类中的方法，可以使用类名调用
        StaticInnerClassDemo2.StaticInnerClassDemo3.show();
        // 非静态的方法必须使用创建对象调用函数
        StaticInnerClassDemo2.StaticInnerClassDemo3 staticInnerClassDemo3 = new StaticInnerClassDemo2.StaticInnerClassDemo3();
        staticInnerClassDemo3.show("Asdfas");

    }
}

/**
 * .
 * 设置外部类
 */
class StaticInnerClassDemo2 {

    /**
     * .
     * 静态内部类
     */
    static class StaticInnerClassDemo3 {

        /**
         * .
         * 内部类非静态方法
         *
         * @param name
         */
        public void show(String name) {
            System.out.println("name = " + name);
        }

        /**
         * .
         * 内部类静态函数
         */
        public static void show() {
            System.out.println("这是内部类的静态方法");
        }
    }


}
