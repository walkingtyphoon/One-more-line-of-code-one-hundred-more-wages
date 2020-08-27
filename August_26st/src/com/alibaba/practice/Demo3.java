package com.alibaba.practice;

public class Demo3 {

    public static void main(String[] args) {
        int [] arr = null;
        getElement(arr, 0);
    }

    public static Integer  getElement(int [] ints,int index){
        if (ints == null) {
            throw new NullPointerException("数据为空");
        }
        return 0;
    }
}
