package oop;
/**值传递
 * @author lantian
 */
public class Demo02 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        Demo02.change(a);
        System.out.println(a);
        Student student = new Student();

        System.out.println("student.name="+student.getName()+student.age);

    }
    public static void change(int a){
        a = 10;
    }
}
