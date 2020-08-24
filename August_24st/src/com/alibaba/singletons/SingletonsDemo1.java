package com.alibaba.singletons;

/**.
 * 复习单例设计模式
 * 饿汉式:
 * 优点:没有加锁，实现简单，执行效率会提高
 * 缺点:多线程不安全；类加载就初始化，浪费内存
 */
public class SingletonsDemo1 {

    public static void main(String[] args) {
        // 创建实例对象；
        System.out.println(Fruits.getInstance() == Fruits.getInstance());
    }
}

/**.
 * 复习单例，饿汉式
 */
class Fruits {

    /**.
     * 1、私有的构造函数
     */
    private Fruits(){

    }

    /**.
     * 全局唯一的实例对象
     */
    private static final Fruits FRUITS = new Fruits();

    /**.
     * 返回全局唯一实例
     * @return 全局唯一的实例对象
     */
    public static Fruits getInstance (){
        // 返回全局的唯一实例
        return FRUITS;
    }
}
