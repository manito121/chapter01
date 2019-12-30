package com.atzh.nio;

import java.nio.IntBuffer;

public class BasicBuffer {
    public static void main(String[] args) {

        //创建buffer，大小为5
        IntBuffer intBuffer = IntBuffer.allocate(5);

        for (int i =0;i<intBuffer.capacity();i++){
            intBuffer.put(i * 2);
        }

        //将buffer转换 ，读写切换
        intBuffer.flip();

        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }

    }

}
