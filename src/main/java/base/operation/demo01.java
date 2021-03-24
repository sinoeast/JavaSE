package base.operation;

public class demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);//强转保证结果

        long c = 1;
        int d =2;
        char e = 3;
        short f = 4;
        System.out.println(c+d+e+f);//long
        System.out.println(d+e+f);//int
        System.out.println(e+f);//int

    }
}
