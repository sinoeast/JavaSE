package oop;

public class Demo03 {
    //引用传递： 对象，本质还是值传递
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.age);//0
        change(person);
        System.out.println(person.age);//10
    }
    public static void change(Person object){
        object.age = 10;
    }

}

class Person{
    int age;
}