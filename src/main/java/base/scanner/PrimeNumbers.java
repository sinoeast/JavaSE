package base.scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        //100-150质数
        outer:
        for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i/2; j++) {
                if (i % j==0){
                    continue outer;
                }
            }
            System.out.print(i+"\t");
        }
    }
}
