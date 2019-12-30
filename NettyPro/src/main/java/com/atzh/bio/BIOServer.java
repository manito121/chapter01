package com.atzh.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BIOServer {

    public static void main(String[] args)throws Exception{

        //创建线程池
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

        //创建ServiceSocket
        ServerSocket serverSocket = new ServerSocket(6666);

        System.out.println("服务启动");

        while (true){

            System.out.println(Thread.currentThread().getId()+";;;"+Thread.currentThread().getName());
            System.out.println("等待连接。。");
            final Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");

            //创建线程与之通讯
            newCachedThreadPool.execute(new Runnable() {
                public void run() {
                    handler(socket);
                }
            });
        }
    }


    public static void handler(Socket socket){
        try {

            byte[] bytes = new byte[1024];
            InputStream inputStream = socket.getInputStream();
            while (true){
                System.out.println(Thread.currentThread().getId()+";"+Thread.currentThread().getName());
                System.out.println("read....");
                int read = inputStream.read(bytes);
                if (read != -1){
                    System.out.println(new String(bytes,0,read));
                }else{
                    break;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("关闭链接");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
