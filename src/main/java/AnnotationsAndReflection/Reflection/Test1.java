package AnnotationsAndReflection.Reflection;

//什么叫反射
public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException {

        //通过反射获取类的class对象
        Class c1=Class.forName("AnnotationsAndReflection.Reflection.User");
        System.out.println(c1);
        Class c2=Class.forName("AnnotationsAndReflection.Reflection.User");
        //一个类在内存中只有一个class对象
        //一个类被加载后,类的整个结构都会被封装在Class对象中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());


        User user= new VipUser();
        System.out.println(user.name);
        //class类的创建方式
        //方式一：通过对象获得
        Class cs1=user.getClass();
        System.out.println(cs1.hashCode());

        //方式二：forname获得
        Class cs2=Class.forName("AnnotationsAndReflection.Reflection.VipUser");
        System.out.println(cs2.hashCode());

        //方式三：通过类名.class获得
        Class cs3=VipUser.class;
        System.out.println(cs3.hashCode());

        //方式四：基本内置类型的包装类都有一个TYPE属性
        Class cs4= Character.TYPE;
        System.out.println(cs4.hashCode());

        //获得父类类型
        Class cs5=cs1.getSuperclass();
        System.out.println(cs5.hashCode());


    }
}

//实体类：pojo， entity
class User{
    private int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


class VipUser extends User{
    public VipUser() {
        this.name="vip";
    }
}
