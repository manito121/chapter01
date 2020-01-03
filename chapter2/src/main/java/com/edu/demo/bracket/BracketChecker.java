package com.edu.demo.bracket;

public class BracketChecker {

    private String input;

    public BracketChecker(String in){
        input = in;
    }

    public void check(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j =0;j<input.length();j++){
            char ch = input.charAt(j);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()){
                        char chx = theStack.pop();
                        if (  (ch=='}' && chx!='{') ||
                              (ch==']' && chx!='[') ||
                              (ch==')' && chx!='(') )
                        {
                            System.out.println("错误："+ch+" at "+j);
                        }
                    }else{
                        System.out.println("错误："+ch+" at "+j);
                    }
                    break;
                default:
                    break;
            }
        }

        if (!theStack.isEmpty()){
            System.out.println("信息错误！");
        }
    }

}
