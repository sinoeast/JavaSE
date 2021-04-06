package oop.Polymorphism;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("学生重写run");
    }
    public void eat(){
        System.out.println("学生eat独有");
    }
}
