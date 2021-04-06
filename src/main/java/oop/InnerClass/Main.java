package oop.InnerClass;

import oop.interface1.Man;

public class Main {

    public static void main(String[] args) {

        //外部类实例化 new
        Outer outer = new Outer();
        outer.out();
        //内部类实例化 通过外部类实例化new一个类
        Outer.Inner inner = outer.new Inner();

        inner.in();
        inner.getId();
        //静态内部类的静态方法
        Outer.Inner2.in();
        //静态内部类的一般方法
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.iin();

    }
}
