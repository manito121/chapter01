package com.edu.demo.bracket;

public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s){
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

//    增加
    public void push(char j ){
        stackArray[++top] = j;
    }

//    取出
    public char pop(){
        return stackArray[top--];
    }

//    查看
    public long peek(){
        return stackArray[top];
    }

//    判空
    public boolean isEmpty(){
        return (top == -1);
    }

//    是否装满
    public boolean isFull(){
        return (top == maxSize-1);
    }

}
