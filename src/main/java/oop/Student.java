package oop;

public class Student {
    private char name;
    int age;

    public Student(char name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
