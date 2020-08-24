package com.alibaba.singletons;

/**
 * .
 * 测试单例设计模式-懒汉式
 * 1、多线程安全；延迟加载
 * 特点：
 * 优点：
 * 1、延迟加载
 * 2、线程安全
 * 缺点：
 * 1、必须加锁才可以保证单例，影响效率
 */
public class SingletonsDemo2 {

    /**
     * .
     * 主函数
     *
     * @param args 主函数参数
     */
    public static void main(String[] args) {
        // 测试是否为单例
        System.out.println(Animal.getInstance() == Animal.getInstance());
    }
}

/**
 * .
 * 创建单例测试类-动物
 */
class Animal {

    /**
     * .
     * 私有构造函数用来创建对象
     */
    private Animal() {
    }

    /**
     * .
     * 声明私有化对象
     */
    private static Animal animal;

    /**
     * .
     * 返回一个全局唯一的实例
     */
    public static synchronized Animal getInstance() {
        if (animal == null) {
            animal = new Animal();
        }
        return animal;
    }
}
