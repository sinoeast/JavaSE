package oop.tree;

/**
 * @author lantian
 */
public class Child extends Father{
//control +H
    private double weight = 10;


    public Child(double weight) {
        this.weight = weight;
    }

    public Child() {
        //隐藏代码，调用了父类的无参构造
        super();//调用父类的构造器，必须在子类构造起的第一行
        System.out.println("child构造");
    }

    public void test(double weight){
        System.out.println("---------");
        System.out.println(weight);
        //this，super
        System.out.println(this.weight);
        //修饰符范围
        System.out.println(super.weight);
    }
}
