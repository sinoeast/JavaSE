package scanner;

import java.util.Scanner;

/**
 * @author lantian
 */
public class Demo02 {
    public static void main(String[] args) {
        int i = 0;
        float f = 0.0f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入整数：");

        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println(i);
        }else {
            System.out.println("没输入整数");
        }

        System.out.println("请输入小数：");
        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println(f);
        }else {
            System.out.println("没输入小数");
        }


        scanner.close();
    }
}
