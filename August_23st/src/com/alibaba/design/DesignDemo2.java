package com.alibaba.design;

/**
 * .
 * <span>单例设计模式-懒汉式</span>
 * <table>
 *     <tr>
 *         特点
 *     </tr>
 *     <tr>
 *             1、多线程安全
 *     </tr>
 *     <tr>
 *             2、延迟加载
 *     </tr>
 *     <tr>
 *         优点:
 *     </tr>
 *     <tr>
 *         第一次调用才初始化，避免内存浪费
 *     </tr>
 *     <tr>
 *         缺点:
 *     </tr>
 *     <tr>
 *         必须加锁，才能保证单例，但加锁会影响效率
 *     </tr>
 * </table>
 */
public class DesignDemo2 {

    /**
     * .
     * 创建测试类
     */
    public static void main(String[] args) {
        // 创建指定对象的实例
        Person person1 = Person.getInstance();
        // 创建多个对象,判断是否为单一的实例
        Person person2 = Person.getInstance();
        // 输出测试对象
        System.out.println(person1 == person2);
    }
}

/**
 * .
 * 创建一个新的实体类
 */
class Person {

    /**
     * .
     * 创建一个私有的构造方法,用于在本类中初始化数据
     */
    private Person() {
    }

    /**
     * .
     * 创建一个全局唯一的私有化对象
     */
    private static Person person;

    /**
     * .
     * 创建一个返回全局唯一的实例对象
     *
     * @return 全局唯一的实例
     */
    public static synchronized Person getInstance() {
        // 判断当前唯一实例是否为空
        if (person == null) {
            // 为空就创建一个新的person 实例对象
            person = new Person();
        }
        // 否则直接返回实例
        return person;
    }
}
