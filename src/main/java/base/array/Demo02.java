package base.array;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] a ={1232,34,234,1342,345,65,6};
        System.out.println(a);//[I@29453f44
        //打印数组元素
        System.out.println(Arrays.toString(a));
        //对数组进行升序排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //赋值1
        Arrays.fill(a,1);
        System.out.println(Arrays.toString(a));

    }
}
