package oop.Polymorphism;

public class Test {

    /*
    静态代码块
    匿名代码块
    构造方法
     */




    public Test() {
        System.out.println("构造方法");
    }
    {
        System.out.println("匿名代码块");//构造方法前
    }
    static {
        System.out.println("静态代码块");//和类一起创建
    }

    public static void main(String[] args) {
        new Test();
    }
}
