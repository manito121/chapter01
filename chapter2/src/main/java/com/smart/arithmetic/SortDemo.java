package com.smart.arithmetic;

import javax.swing.*;

public class SortDemo {

    public static void main(String[] args) {
       /* int [] arr = new int[10];
        arr[0] =  77;
        arr[1] =  99;
        arr[2] =  44;
        arr[3] =  55;
        arr[4] =  22;
        arr[5] =  88;
        arr[6] =  11;
        arr[7] =  0;
        arr[8] =  66;
        arr[9] =  33;
        bubbleSort(arr);*/
        //0000000200122568
        String result = null;
        String s1 = "10033658908";
        Long result1 = Long.valueOf(s1);
        result=String.format("%0"+16+"d",result1);
        System.out.println(result);

    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int []arr) {
        for(int i =1;i<arr.length;i++) {
            for(int j=0;j<arr.length-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr);
    }

}
