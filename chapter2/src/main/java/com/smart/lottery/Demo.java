package com.smart.lottery;

/**
 备注：红球一共6组，每组从1-33中抽取一个，六个互相不重复。然后蓝球是从1-16中抽取一个数字 .


 */

public class Demo {

    private String name;

    public static void main(String[] args) {
        String CustNum1 = null;
        String str = "<ResponseBody><CerType>1</CerType><CerNo>372801196303110032</CerNo><CustName13>蜜银北京j</CustName13><CustNum1>200122568</CustNum1></ResponseBody>";
        if (str.indexOf("<CustNum1>") != -1) {

            System.out.println(str.length());
            System.out.println(str.indexOf("<CustNum1>"));
            System.out.println(str.indexOf("<CustNum1>")+11);
            CustNum1 = str
                    .substring(str.indexOf("<CustNum1>"),
                            str.indexOf("</CustNum1>") + 11);
        }
//        System.out.println(CustNum1);
        
        if (str.indexOf("<CustNum1>") != -1) {

            System.out.println(str.length());  
//            System.out.println(str.indexOf("<CustNum1>"));
//            System.out.println(str.indexOf("<CustNum1>")+11);
             CustNum1 = str.substring(
                     str.indexOf("<CustNum1>") + 10,
                     str.indexOf("</CustNum1>")
             );
              System.out.println(CustNum1); 
        }

    }

}


