package com.alibaba.practice;

import java.util.Arrays;

public class Demo6 {

    public static void main(String[] args) {

        findNumber(6, "0 5 5 0 5 0");
    }


    /**
     * .
     * 计算符合条件拼接出来的最大数
     *
     * @param value   数组最大长度
     * @param content 数据
     * @return 寻找到的最大数据
     */
    public static int findNumber(int value, String content) {
        // 用于获取起始位的数组
        char[] chars1 = content.replaceAll(" ", "").toCharArray();
        // 用于获取结束位的数组
        char[] chars2 = content.replaceAll(" ", "").toCharArray();
        // 遍历数组获取数据
        for (int j = 0; j < chars1.length; j++) {
            // 多次遍历获取数据
            for (int i = 0; i < chars1.length - 1; i++) {
                // 获取可组成的最小值
                if (chars1[i] > chars1[i + 1]) {
                    chars1[i] ^= chars1[i + 1];
                    chars1[i + 1] ^= chars1[i];
                    chars1[i] ^= chars1[i + 1];
                }
                // 获取可组成的最大值
                if (chars2[i] < chars2[i + 1]) {
                    chars2[i] ^= chars2[i + 1];
                    chars2[i + 1] ^= chars2[i];
                    chars2[i] ^= chars2[i + 1];
                }

            }
        }
        // 解析获取的最小值
        int min = Integer.parseInt(String.valueOf(chars1));
        // 解析获取的最大值
        int max = Integer.parseInt(String.valueOf(chars2));
        // 声明获取的目标数组
        int target = 0;
        // 遍历最小和最大之间的数据
        for (int i = min; i <= max; i++) {
            // 判断是否符合要求
            if (i % 90 == 0) {
                // 循环赋值符合要求的数组
                String s = String.valueOf(i);

                if (s.matches("[^12346789]")) {
                    System.out.println("s = " + s);
                }
            }
        }
        // 返回获取的数据
        return target;
    }
}
