package base;

//作用域
public class Demo03 {
    final int Constant = 2021;
    static int a = 1;		//类变量 从属于类，static关键词
    int b;							//实例变量 从属于对象;如果不自行初始化，这个类型的默认值 0 0.0
    //布尔值：默认是false
    //除了基本类型，其余都是null
    public static void main(String[] args) {
        int c =3;					//局部变量 必须声明和初始化值
        Demo03 demo03 = new Demo03();
        System.out.println(demo03.b);
        System.out.println(a);
    }
}