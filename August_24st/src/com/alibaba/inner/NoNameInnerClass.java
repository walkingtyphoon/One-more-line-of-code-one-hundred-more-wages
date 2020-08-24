package com.alibaba.inner;

/**.
 * 匿名内部类
 */
public class NoNameInnerClass {

    /**.
     * 测试匿名内部类的主函数
     * @param args 主函数参数
     */
    public static void main(String[] args) {
        // 测试匿名内部类
        new Runnable() {
            @Override
            public void run() {
                System.out.println("这是匿名内部类的函数");
            }
        }.run();
    }
}
