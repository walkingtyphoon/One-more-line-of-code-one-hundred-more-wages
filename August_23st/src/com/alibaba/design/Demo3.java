package com.alibaba.design;

/**.
 * 测试枚举的常用函数
 * enum 定义的枚举类默认继承了 java.lang.Enum 类，并实现了 java.lang.Seriablizable 和 java.lang.Comparable 两个接口。
 *
 * values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：
 *
 * values() 返回枚举类中所有的值。
 * ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
 * valueOf()方法返回指定字符串值的枚举常量。
 */
public enum Demo3 {

    RED,GREEN,BLUE;
}

class Demo3Test {

    public static void main(String[] args) {
        // 获取枚举中的所有值,返回一个数组
        Demo3[] values = Demo3.values();
        // 便利所有的数据，获取每个枚举常量的索引
        for (Demo3 value : values) {
            // 输出当前元素的索引
            System.out.println(value + "的索引为" + value.ordinal());
        }
        // 返回指定的枚举常量不存在则报错 Exception in thread "main" java.lang.IllegalArgumentException:
        System.out.println(Demo3.valueOf("BLUE"));
    }

}
