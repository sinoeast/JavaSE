package oop.interface1;


//interface 定义的关键字 接口都需要有实现类
public interface Person {
    //静态常量
    public static final int i = 99;
    //接口中的所有定义其实都是抽象的 public abstract
    void eat();
    String run(String name);
}
