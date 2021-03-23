package operation;

public class Demo02 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;//先赋值再自增
        System.out.println(a);//4
        int c = ++a;//先自增再赋值
        System.out.println(a);//5
        System.out.println(b);//3
        System.out.println(c);//5
        //幂运算 9^9
        double pow=Math.pow(9,9);
        System.out.println();
    }
}
