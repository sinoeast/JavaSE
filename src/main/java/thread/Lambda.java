package thread;

public class Lambda {

    public static void main(String[] args) {
        Math math = (a,b) -> {
            System.out.println(a+b);
            System.out.println(a-b);
        };
        math.add(1,2);
    }
}

interface Math{
    void add(int a,double b);
}
