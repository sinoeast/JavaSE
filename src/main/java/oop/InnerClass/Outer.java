package oop.InnerClass;

public class Outer {
    private int id = 10;
    public void out(){
        System.out.println("这是外部类方法");
    }

    class Inner{
        public  void  in(){
            System.out.println("这是内部类的方法");
        }

        //获得外部类的私有属性
        public void getId(){
            System.out.println(id);
        }
    }
    static class Inner2{
        public static  void  in(){
            System.out.println("这是静态内部类的方法");
        }
        public void iin(){
            System.out.println("iin");
        }

    }
}
