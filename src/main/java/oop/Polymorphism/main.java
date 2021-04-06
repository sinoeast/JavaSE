package oop.Polymorphism;

public class main {
    public static void main(String[] args) {

        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型就不确定了；父类的引用可以指向子类

        //Student 能调用的方法都是自己的或者继承父类的
        Student student = new Student();
        Teacher teacher = new Teacher();
        //Person 父类型，可以指向子类，但是不能调用子类独有的方法
        Person personStu = new Student();
        Person personTea = new Teacher();
        Object object = new Student();


        personStu.run();//子类重写了父类的方法，执行子类的方法
        student.run();
        teacher.run();

        personStu.norun();//子类不重写，只继承，执行父类的方法
        student.norun();
        teacher.norun();

        ((Student)personStu).eat();//person.eat() 声明类型中没有eat()方法，动态类型（student）中存在eat()方法
        student.eat();
        System.out.println("------------");
        //应用场景  多态是同一个接口，使用不同的实例而执行不同操作
        //通过一个变量去调用一个函数，我们只是写了这么一句话，我们并不去判断变量实际的类型是什么，不需要写switchcase，不需要ifelse，
        //只要说person.run() 只要说person.norun()对应的函数就会被调用出来 这件事就叫做多态
        //方法中声明的是Person的静态变量，但执行时会使用取到的动态类型（取到什么类型执行什么类型）
        use(personStu);//学生重写run
        use(personTea);//教师重写run
        use(student);//学生重写run
        use(teacher);//教师重写run



//        Object object = new Student();
        Person person = new Student();
//        Student student = new Student();

        //System.out.println(X instanceof Y);能不能编译通过 XY是否存在父子关系
        //X是Y的子类型 true 否则是false
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
//        System.out.println(person instanceof String);//编译报错
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
//        System.out.println(student instanceof Teacher);//编译报错
//        System.out.println(student instanceof String);//编译报错







    }
    public static void use(Person person){
        person.run();
    }


}
