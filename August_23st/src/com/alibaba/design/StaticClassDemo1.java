package com.alibaba.design;

/**
 * .
 * 登记式/静态内部类
 * 1、多线程安全
 * 2、实现难度一般
 * 描述:
 * <div>
 *     描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
 *     这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。这种方式同样利用了 classloader
 *     机制来保证初始化 instance 时只有一个线程，它跟第 3 种方式不同的是：第 3 种方式只要 Singleton 类被装载了，
 *     那么 instance 就会被实例化（没有达到 lazy loading 效果），而这种方式是 Singleton 类被装载了，
 *     instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，
 *     才会显式装载 SingletonHolder 类，从而实例化 instance。想象一下，如果实例化 instance 很消耗资源，
 *     所以想让它延迟加载，另外一方面，又不希望在 Singleton 类加载时就实例化，因为不能确保 Singleton 类还可能
 *     在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。这个时候，
 *     这种方式相比第 3 种方式就显得很合理。
 * </div>
 */
public class StaticClassDemo1 {

    /**
     * .
     * 测试登记式,静态内部类
     *
     * @param args 主函数
     */
    public static void main(String[] args) {
        // 创建测试对象一
        Apple apple1 = Apple.getInstance();
        // 创建测试对象二
        Apple apple2 = Apple.getInstance();
        // 判断二者是否相同
        System.out.println(apple1 == apple2);
        /*
         * 因为二者底层最终都指向底层的唯一一个全局对象
         * ，所以编译器自动判断二者相同
         * */
    }
}

class Apple {

    /**
     * .
     * 创建静态内部类
     */
    private static final class RedApple {
        // 创建一个全局唯一的实例
        private static final Apple APPLE = new Apple();
    }

    /**
     * .
     * 创建一个私有无参构造
     */
    private Apple() {
    }

    /**
     * .
     * 通过静态内部类获取一个全局唯一的实例
     *
     * @return 一个全局唯一实例
     */
    public static final Apple getInstance() {
        return RedApple.APPLE;
    }
}
