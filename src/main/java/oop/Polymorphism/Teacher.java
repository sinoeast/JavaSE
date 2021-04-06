package oop.Polymorphism;

public class Teacher extends Person{

    @Override
    public void run() {
        System.out.println("教师重写run");
    }

    @Override
    public void norun() {
        System.out.println("教师重写norun");
    }
}
