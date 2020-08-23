package com.alibaba.design;

/**
 * .
 * 测试单例设计模式:
 * what:<br>
 * &nbsp;1、保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * <br>
 * why:<br>
 *  答：1、一个全局使用的类频繁地创建和销毁<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2、在内存中只有一个实例，减少了内存的开销，尤其是<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;频繁的创建和销毁实例<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3、避免对资源的多种占用(比如写文件操作)<br>
 *
 * 缺点:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1、没有接口，不能继承，与单一职责原则冲突，一个类<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;只关心内部逻辑，而不关心外面怎么样来实例化<br>
 *
 * where:<br>
 * &nbsp;答：1、当你想控制实例数目，节省系统资源的时候<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2、要求生产唯一的序列号<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3、创建一个对象需要消耗的资源过多，比如I/O与数据库的链接等<br>
 *
 * 关键代码:<br>
 * &nbsp;答：构造函数是私有的<br>
 *
 * notice:<br>
 * &nbsp;1、单例类只能由一个实例<br>
 * &nbsp;2、单例类必须自己创建自己的唯一实例<br>
 * &nbsp;3、单例类必须给所有其他对象提供这一实例<br>
 * &nbsp;4、getInstance() 方法中需要使用同步锁synchronized(xxx.class)，<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;防止多线程同时进入造成instance被多次实例化<br>
 * <br>
 * 1、饿汉式:一上来就创建对象，不论该对象是否创建，线程不安全<br>
 * <span>单例设计模式-懒汉式</span>
 * <table>
 *     <tr>
 *         特点
 *     </tr>
 *     <tr>
 *         <td>
 *             1、多线程安全
 *         </td>
 *     </tr>
 *     <tr>
 *         优点:
 *     </tr>
 *     <tr>
 *         <td>
 *          没有加锁，执行效率会提高
 *         </td>
 *     </tr>
 *     <tr>
 *         缺点:
 *     </tr>
 *     <tr>
 *         <td>
 *          类加载时，就初始化，浪费内存
 *         </td>
 *     </tr>
 * </table>
 */
public class DesignDemo1 {

    /**
     * .
     * 程序的主函数
     *
     * @param args 主函数参数
     */
    public static void main(String[] args) {
        // 测试单例设计模式之饿汉式(线程不安全)
        Student student1 = Student.getInstance();
        // 创建对象二，用于检测二者对象是否相同
        Student student2 = Student.getInstance();
        // 输出测试是否为同一个对象
        System.out.println(student1 == student2);
        /*
          todo:
           因为其底层使用的是同一个对象，所以两者的属性信息，
           完全相同，因此编译器认为它总是true;
         */
    }
}

/**
 * .
 * 创建学生的实体类
 */
class Student {

    /**
     * .
     * 1、创建私有的构造函数
     */
    private Student() {

    }

    /**
     * .
     * 2、创建一个全局唯一的新实例对象
     */
    private final static Student STUDENT = new Student();

    /**
     * .
     * 3、创建一个返回唯一实例的静态方法
     *
     * @return 一个全局唯一的实例
     */
    public synchronized static Student getInstance() {
        // 返回一个全局唯一的实例
        return STUDENT;
    }
}