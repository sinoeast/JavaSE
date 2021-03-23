package operation;


/**
 * @author lantian
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(2<<3);
        int a = 10;
        int b = 20;

        System.out.println(a+=b);
        //a = a+b
        System.out.println(""+a+b);
        //字符连接
        System.out.println(a+b+"");
        System.out.println(a>b?10:11);
        //三元运算符

    }
}
