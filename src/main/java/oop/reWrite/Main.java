package oop.reWrite;

public class Main {

    public static void main(String[] args) {
        //静态方法的调用只和左边，定义的数据类型有关
        //（静态属于类，一加载就存在。非静态属于对象，实例化后生成）
        //非静态：重写
        A a = new A();
        a.test();//AAAAA

        //父类的引用指向了子类
        B b = new A();//子类重写了父类的方法
        b.test();//AAAAA

        //静态方法和非静态方法区别很大
        A.testStatic();//AAAAA
        B.testStatic();//BBBBB

    }

}
