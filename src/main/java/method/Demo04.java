package method;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println(f(4));
    }

    public static int f(int i){
        if (i==1){
            return 1;
        }else {
            return i*f(i-1);
        }
    }
}
