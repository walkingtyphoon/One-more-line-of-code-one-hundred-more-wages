package com.alibaba.practice;


import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
    public static void main(String [] args) {
        // 创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        // 输出提示信息
        System.out.println("请输入你需要使用的最大卡牌数:");
        // 录入一个最大的卡牌数
        int value = scanner.nextInt();
        // 输出提示信息
        System.out.println("请输入你需要使用的卡牌");
        // 获取需要使用的卡牌
        String content = scanner.next();
        // 输出监测数据
        System.out.println("content = " + content);
    }
}
