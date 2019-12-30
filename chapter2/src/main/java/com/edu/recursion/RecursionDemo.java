package com.edu.recursion;

public class RecursionDemo {

    public static void main(String[] args) {


        /*int triangle = triangle(7);
        System.out.println(triangle);*/

//        int triangle1 = triangle1(7);

        //不用static 则创建实例
        RecursionDemo recursionDemo = new RecursionDemo();
        int triangle1 = recursionDemo.triangle1(7);
        System.out.println(triangle1);
    }

    public static int triangle(int n ){
        int total = 0;
        while (n>0){
            total = total+n;
            --n;//n--（先赋值再自减）和--n （先自减再赋值）就是赋值的区别
        }
        return total;
    }

    public int triangle1(int n ){
        if(n==1){
            return 1;
        }else{
            int temp = triangle1(n - 1);
            int all = temp + n;
            return all;
        }
    }
}
