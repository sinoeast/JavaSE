package base.method;

public class Demo03 {
    public static void main(String[] args) {
        add(1,2,3,4,5,6);
    }
    public static void add( int j,double... d){
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);

        }
    }
}
