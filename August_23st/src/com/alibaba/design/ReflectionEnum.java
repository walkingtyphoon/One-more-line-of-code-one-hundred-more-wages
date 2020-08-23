package com.alibaba.design;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * .
 * 测试反射枚举
 *
 * @author walki
 */
public class ReflectionEnum {

    /**。
     * 程序主函数
     * @param args 主函数参数
     * @throws NoSuchMethodException 没有这个方法的一场
     * @throws IllegalAccessException 暴力反射异常
     * @throws InvocationTargetException 实例化异常
     * @throws InstantiationException 获取实例异常
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 创建反射枚举对象
        Class<Enum4> demo1Class = Enum4.class;
        // 获取其变量
        Field[] declaredFields = demo1Class.getDeclaredFields();
        // 遍历所有的变量
        for (Field declaredField : declaredFields) {
            // 输出所有的变量
            System.out.println("declaredField = " + declaredField);
        }
        // 获取私有的构造函数
        Constructor<?>[] declaredConstructors = demo1Class.getDeclaredConstructors();
        // 遍历所有的构造函数
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            // 设置暴力反射
            declaredConstructor.setAccessible(true);
            // 创建其对象
            declaredConstructor.newInstance();
        }

    }
}
