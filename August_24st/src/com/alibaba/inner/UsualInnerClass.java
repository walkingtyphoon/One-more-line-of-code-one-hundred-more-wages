package com.alibaba.inner;

/**.
 * 测试普通内部类
 */
public class UsualInnerClass {
    public static void main(String[] args) {
        // 创建内部类
        UsualInnerClassDemo1.UsualInnerClassDemo2 usualInnerClassDemo2 = new UsualInnerClassDemo1().new UsualInnerClassDemo2();
        // 测试内部类的方法
        usualInnerClassDemo2.show();
    }
}

class UsualInnerClassDemo1 {

    /**.
     * 普通内部类
     */
    class UsualInnerClassDemo2 {

        /**.
         * 内部类方法
         */
        public void show() {
            System.out.println("这是普通内部类的方法");
        }
    }
}