package scanner;

import java.util.Scanner;

/**
 * @author lantian
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");

        //判断用户有没有输入字符串
        if(scanner.hasNextLine()){
            //  使用next方式接收
            String s = scanner.nextLine();
            System.out.println("输出的内容是："+s);
        }
        scanner.close();


    }
}
