package com.alibaba.design;

/**
 * .
 * 枚举类成员
 * 枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 private 访问修饰符，所以外部无法调用。
 * <p>
 * 枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。
 */
public enum Enum4 {
    // 设置枚举常量
    RED, BLUE, GREEN;

    // 设置枚举私有构造函数
    Enum4() {
        System.out.println(this.toString());
    }

    /**
     * 设置普通函数
     */
    public void show() {
        System.out.println("hello enum");
    }
}

/**
 * .
 * 测试枚举类成员
 */
class Enum4Test {

    /**.
     * 主函数
     * @param args 主函数参数
     */
    public static void main(String[] args) {
        // 获取枚举数据
        Enum4 enum4 = Enum4.BLUE;
        // 输出枚举数据
        System.out.println("enum4 = " + enum4);
        // 调用枚举的方法
        enum4.show();
    }
}