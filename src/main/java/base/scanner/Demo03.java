package base.scanner;

import java.util.Scanner;

/**
 * @author lantian
 */
public class Demo03 {

    public static void main(String[] args) {
        //输入多个数字。求总和和平均数 ，没输入一个数字用回车键确认，通过输入非数字来结束输入执行结果
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double num = 0;
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            total += x;
            num += 1;
        }

        System.out.println("总和："+total);
        System.out.println("平均："+total/num);

        scanner.close();
    }

}
