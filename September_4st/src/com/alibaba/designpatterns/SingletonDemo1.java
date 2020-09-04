package com.alibaba.designpatterns;


/**
 * .
 * 单例设计模式:
 * 核心作用：保证一个类只有一个实例，并且提供一个访问该实例的全局访问点
 */
public class SingletonDemo1 {


}


class Person {

    // 1、设置是私有化的构造函数
    private Person() {
    }

    // 创建全局唯一实例,类初始化时，立即加载这个对象，线程是安全的，没有延迟加载的优势
    private final static Person PERSON = new Person();

    /**
     * .
     * 创建一个返回全局唯一实例的公共访问方法
     * 没有同步，调用效率高
     */
    public static Person getInstance() {
        return PERSON;
    }
}


class Animal {

    // 创建私有的构造函数
    private Animal() {}

    // 类初始化时，不初始化这个对象(延迟加载，真正调用时再创建)
    private static Animal animal;

    /**
     * .
     * 创建获取的唯一实例的公共方法
     * 方法同步，调用效率低
     */
    public static synchronized Animal getInstance() {
        if (animal == null) {
            animal = new Animal();
        }
        return animal;
    }
}


class Student {


    // volatile 用以声明变量的值可能随时会别的线程修改,声明一个新的实例对象
    private volatile static Student student;

    // 声明私有的构造函数
    private Student(){}

    /**.
     * 创建双检锁，采用双锁的机制保证线程安全
     */
    public static Student getInstance(){
        if (student == null) {
            synchronized(Student.class){
                if (student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }

}
