package base.scanner;

/**
 * @author lantian
 */
public class Nine_nine {
    public static void main(String[] args) {
        //打印九九乘法表
        for (int i = 1; i < 10; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print(i+"*"+y+"="+i*y+"\t");

            }
            System.out.print("\n");

        }
    }

}
