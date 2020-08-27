package com.alibaba.practice;

import java.util.*;

import static java.util.Arrays.copyOf;

/** .
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4。
 */
public class Demo4 {

    /** .
     * 获取指定长度的最小数据
     * @param input 需要截取的数据
     * @param k     截取的位数
     * @return 截取后的数据
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        // 创建新的集合
        ArrayList<Integer> list = new ArrayList<>();
        // 判断是否为空
        if (input == null) {
            return list;
        }
        // 判断是否截取位数违规
        if ((k < 0) || (k > input.length)) {
            return list;
        }
        // 排序数据
        Arrays.sort(input);

        // 遍历复制后的数组元素并添加到集合中
        Arrays.stream(copyOf(input, k)).forEach(list::add);
        // 返回集合
        return list;
    }

    /**.
     * 程序的主函数
     * @param args 主函数参数
     */
    public static void main(String[] args) {
        System.out.println(GetLeastNumbers_Solution(new int[]{1, 5, 6, 9, 6, 3, 58}, 10));
    }
}
