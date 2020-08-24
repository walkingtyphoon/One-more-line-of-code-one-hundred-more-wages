package com.alibaba.net.demo1;

import java.io.*;
import java.net.Socket;

public class SocketDemo1 {

    /**.
     * 客户端对象
     * @param args 主函数参数
     */
    public static void main(String[] args) throws IOException {
        // 创建客户端对象
        Socket socket = new Socket("localhost", 8080);
        // 链接连接成功
        System.out.println("客户端连接成功");
        // 创建输入流
        OutputStream outputStream = socket.getOutputStream();
        // 写出数据
        outputStream.write("大家好,我是客户端!".getBytes());
        // 刷出缓冲区
        outputStream.flush();
    }
}
