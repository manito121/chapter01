package com.edu.demo.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReserveApp {

    public static void main(String[] args) throws IOException {

        String input,output;
        while (true){
            System.out.println("输入一个字符串");
            System.out.flush();
            input = getString();
            if (input.equals("")){
                break;
            }
            Reverser reverser = new Reverser(input);
            output = reverser.doRev();
            System.out.println("输出："+output);

        }

    }

    public static String getString() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        String s = bf.readLine();
        return s;
    }
}
