package com.alibaba.net.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * .
 * 创建ServerSocket，监听端口
 */
public class ServerSocketDemo1 {


    /**
     * .
     * 程序的主函数
     *
     * @param args 主函数参数
     * @throws IOException 流传输可能存在的异常
     */
    public static void main(String[] args) throws IOException {
        // 创建服务器监听对象
        ServerSocket serverSocket = new ServerSocket(8080);
        // 捕获链接
        Socket accept = serverSocket.accept();
        // 输出提示信息
        System.out.println("链接已经捕获");
        // 输出用户输入的信息
        InputStream inputStream = accept.getInputStream();
        // 创建临时变量
        int value;
        // 读取输入流
        while ((value = inputStream.read()) != -1){
            // 输出获取到的字节数据
            System.out.println((char) value);
        }
    }
}
