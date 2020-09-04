package com.alibaba.maths;

import java.util.Arrays;

public class ArrayCopyDemo1 {

    public static void main(String[] args) {
        // 原始数组
        int[] arr1 = {1, 2, 3, 6, 5, 4};
        // 需要复制的目标数组
        int[] arr2 = new int[11];
        // 复制的开始数组，起始位置，目标数组，起始位置，复制的长度
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        // 输出测试
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
