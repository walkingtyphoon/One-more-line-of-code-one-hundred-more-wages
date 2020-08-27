package com.alibaba.practice;

import java.util.Arrays;

/**
 * .
 * 求出1~13的整数中1出现的次数,
 * 并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有
 * 1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数
 * （从1 到 n 中1出现的次数）。
 */
public class Demo1 {

    public static int NumberOf1Between1AndN_Solution(int n) {
        // 统计次数
        int count = 0;
        // 遍历数据
        for (int i = 1; i <= n; i++) {
            // 遍历获取到的字符
            for (char c : String.valueOf(i).toCharArray()) {
                // 判断是否相等
                if ('1' == c) {
                    // 相等则加加
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(args[0]);
        NumberOf1Between1AndN_Solution(13);
    }
}
