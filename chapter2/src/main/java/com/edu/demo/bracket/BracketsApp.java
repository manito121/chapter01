package com.edu.demo.bracket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {

    // a{b(c)d}e
    // a{b[c)d}e
    public static void main(String[] args) throws IOException {
        String input;
        while (true){
            System.out.println("请输入：");
            System.out.flush();
            input = getString();
            if (input.equals("")){
                break;
            }
            BracketChecker bracketChecker = new BracketChecker(input);
            bracketChecker.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        String s = bf.readLine();
        return s;
    }

}
