package base.method;

import java.util.Scanner;

/**
 * @author lantian
 */
public class Calculator {
    public static void main(String[] args) {
        //创建Scanner对象
            Scanner scanner = new Scanner(System.in);
        //定义字符串，作为while初始执行条件
            String isNext = "y";

            while (isNext.equals("y")){
                //操作数1
                double i1=0;
                //操作数2
                double i2=0;
                //结果
                double result=0;
                //运算符，通过switch
                String opera="+";
                System.out.println("请输入第一个操作数：");
                i1=scanner.nextDouble();
                System.out.println("请输入运算符：");
                opera=scanner.next();
                System.out.println("请输入第二个操作数：");
                i2=scanner.nextDouble();
                switch (opera){
                    case "+":
                        System.out.println("您选择"+opera+"运算符：");
                        result=add(i1,i2);
                        System.out.println("结果为"+i1+opera+i2+"="+result);
                        break;
                    case "-":
                        System.out.println("您选择"+opera+"运算符：");
                        result=sub(i1,i2);
                        System.out.println("结果为"+i1+opera+i2+"="+result);
                        break;
                    case "*":
                        System.out.println("您选择"+opera+"运算符：");
                        result=mul(i1,i2);
                        System.out.println("结果为"+i1+opera+i2+"="+result);
                        break;
                    case "/":
                        if(i2==0){
                        System.out.println("除数不能为0");
                            }else{
                                System.out.println("您选择"+opera+"运算符：");
                                result=div(i1,i2);
                                System.out.println("结果为"+i1+opera+i2+"="+result);
                    }
                    break;
                    default:
                        System.out.println("输入运算符错误！");
                        break;
                }
                System.out.println("是否继续计算?(输入y继续，其他任意键结束)：");
                //终止条件
                isNext=scanner.next();
            }
            System.out.println("感谢使用本计算器！");
            scanner.close();
        }
        public static double add(double num1,double num2){
            return num1+num2;
        }
        public static double sub(double num1,double num2){
            return num1-num2;
        }
        public static double mul(double num1,double num2){
            return num1*num2;
        }
        public static double div(double num1,double num2){
            return num1/num2;
        }
}
