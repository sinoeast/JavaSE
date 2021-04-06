package oop.tree;

/**
 * @author lantian
 */
public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.setWeight(99);
        System.out.println(child.getWeight());

        child.test(1);
    }
}
