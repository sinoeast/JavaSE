package base;

public class Demo02 {
    public static void main(String[] args) {
        int i = 128;
        byte b =(byte)i;//内存溢出
        System.out.println(i);//128
        System.out.println(b);//-128
        float f = 45.123f;
        int ii = (int)f;
        System.out.println(ii);

        //操作比较大的数的时候，注意溢出问题
        //jdk7新特性，数字之间可以用下划线分隔
        int money = 10_0000_0000;
        int year = 12;
        int total = money*year;//-884901888
        long total2 =money*year;//-884901888 默认是int，转换之前已经存在问题了
        long total3 =money*(long)year;//12000000000 先把一个数转换为long
        System.out.println(money);
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);


    }
}
