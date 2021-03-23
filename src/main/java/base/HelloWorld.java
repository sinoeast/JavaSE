package base;

import java.math.BigDecimal;

public class HelloWorld {
    public static void main(String[] args) {
        //八大基本数据类型
        //整数
        int num1=10;//最常用
        byte num2= 20;
        short num3 = 30;
        long num4=30L;//Long类型要在数字后面加个L
        //小数:浮点数
        float num5=50.1F;//float类型要在数字后面加个F
        double num6=3.141592653589793238462643;
        //字符
        char name='国';
        //字符串，String不是关键字,类
        // String name="蓝天";

        //布尔值:是非
        boolean flag = true;
        //booLean fLag false


        //整数拓展:
        // 进制 二进制0b 十进制 八进0  十六进制0x
        int i = 10;
        int i2 = 010;//八进制e
        int i3 = 0x10;//十六进制0x
        int i4 = 0b10;//二进制
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);


        //浮点数拓展
        //float 有限 离散 舍入误差 大约 接近但不等于
        //double
        float f = 0.1f;//0.1
        double d = 0.1;//0.1
        System.out.println(f==d);//false

        float f1 = 8513287816546f;
        float f2 = f1 + 1;
        System.out.println(f1==f2);//true


        //字符拓展
        char c1 = '`';
        char c2 = '中';

        System.out.println((int)c1);		//强制转换97
        System.out.println((int)c2);		//强制转换20013

        //所有的字符本质还是数字
        //编码 unicode>ASCII表（97 = a，65 = A） 2字节 65536

        // U0000 UFFFF
        char c3 = '\u0060';
        System.out.println("c3="+c3);

        //转义字符
        //\t 制表符
        //\n 换行
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");

        String sa = new String("hello");
        String sb = new String("hello");
        System.out.println(sa==sb);//false
        String sc = "hello";
        String sd = "hello";
        System.out.println(sc==sd);//true
        //对象 从内存分析


        //布尔值拓展
        boolean bool = true;
        if(bool=true){}//新手
        if(bool){}//老手
        //Less is More 代码要精简易读




    }
}