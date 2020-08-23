package com.alibaba.design;

/**
 * .
 * 枚举是一种特殊的类，一般用来表示一组常量
 */
public enum Demo1 {
    RED, BLUE, GREEN;
}

/**
 * .
 * 测试枚举的使用
 */
class Demo2 {
    public static void main(String[] args) {
        // 获取枚举中的常量值
        Demo1 demo1 = Demo1.BLUE;
        // 测试常量值
        System.out.println("demo1 = " + demo1);

        // 测试内部类使用枚举
        Demo3 demo3 = Demo3.WINE;
        // 测试枚举
        System.out.println("demo3 = " + demo3);

        // 迭代所有的枚举元素
        for (Demo3 demo : Demo3.values()) {
            // 输出所有的变量
            System.out.println("demo = " + demo);
        }


        // 在switch 中使用枚举
        switch(demo3){
            // 设置对应的分支
            case WINE:
                System.out.println("WINE");
                break;
            case BLACK:
                System.out.println("BLACK");
                break;
        }
    }

    /**.
     * 内部类中使用枚举
     */
    enum Demo3 {
        // 设置枚举常量
        BLACK,WINE;
    }
}
