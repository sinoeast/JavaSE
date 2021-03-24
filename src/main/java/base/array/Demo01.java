package base.array;

/**
 * @author lantian
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        print(num);
        System.out.println("-----------");
        int[] a=reverse(num);
        System.out.println(print(a));


    }
    public static int[] reverse(int[] a){
        int[] result = new int[a.length];
        for (int i = 0, j = a.length-1; i < a.length; i++,j--) {
            result[j] = a[i];
        }
        return result;
    }
    public static String print(int[] a){
        if (a == null) {
            return "null";
        }
        int iMax = a.length - 1;
        if (iMax == -1) {
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
    }
}
