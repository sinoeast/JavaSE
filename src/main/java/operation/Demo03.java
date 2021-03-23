package operation;

public class Demo03 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!a);

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);
        System.out.println(d);
        System.out.println(c);
    }
}
