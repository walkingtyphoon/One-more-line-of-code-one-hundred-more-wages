package com.alibaba.singletons;

public class DoubleCheckedLocking {

    public static void main(String[] args) {

    }
}

class Life {

    /**.
     * 创建无参的构造函数
     */
    private Life() {

    }

    /**.
     * 声明实例对象
     */
    private static Life life;

    /**.
     * 创建基于双重校验锁实现单例设计模式
     * @return 全局唯一的实例对象
     */
    public static Life getInstance() {
        if (life == null) {
            synchronized (Life.class) {
                if (life == null) {
                    life = new Life();
                }
            }
        }
        return life;
    }


}
