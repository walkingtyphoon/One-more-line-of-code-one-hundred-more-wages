package com.alibaba.design;

/**
 * .
 * 创建枚举类
 */
public class Pig {

    /**.
     * 私有构造
     */
    private Pig() {}


    enum PinkPig {
        // 创建一个枚举对象，该对象天生为单例
        INSTANCE;

        // 声明新的对象
        private final Pig pig;

        // 私有化枚举的无参构造
        PinkPig() {
            pig = new Pig();
        }

        /**.
         * 返回一个实例，通过枚举，不暴露内部实现
         * @return 全局唯一的实例
         */
        public Pig getInstance() {
            return pig;
        }
    }

    /**.
     * 对外设置一个获取对象的静态方法
     * @return 全局唯一，且线程安全实现简单
     */
    public static Pig getInstance() {
        return PinkPig.INSTANCE.getInstance();
    }

}

/**
 * .
 * 创建测试类
 */
class PigTest {

    /**
     * .
     * 主函数
     *
     * @param args 主函数参数
     */
    public static void main(String[] args) {
        // 获取实例一
        Pig instance1 = Pig.getInstance();
        // 获取实例二
        Pig instance2 = Pig.getInstance();
        // 测试数据
        System.out.println(instance1 == instance2);
    }
}
