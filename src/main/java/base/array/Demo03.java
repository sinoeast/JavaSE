package base.array;

public class Demo03 {
    public static void main(String[] args) {
        int[] i ={9,1,5,2,4,8,4,3,7,0,5,6,8};
        bubbleSort(i);
    }

//冒泡排序
//1,比较数组中,两个相邻的元素,如果第一个数比第二个数大,我们就交换他们的位置
//2.每一次比较,都会产生出一个最大,或者最小的数字
//3.下一轮则可以少一次排序!
//4.依次新环,直到结束
    public static void bubbleSort(int[] i){
        int flag = 0;
        for (int a = 0; a < i.length-1; a++) {
            for (int b = 0; b < i.length-1-a; b++) {
                if(i[b]>i[b+1]){
                   flag = i[b];
                   i[b] = i[b+1];
                   i[b+1] = flag;
                }
            }
        }
        for (int a:
             i) {
            System.out.println(a);
        }
    }
}
