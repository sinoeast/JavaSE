package base.array;

/**
 * @author lantian
 */
public class Demo04 {
    public static void main(String[] args) {
        //1。创建一个二维数组
        int[][] array = new int[6][7];
        array[0][3] =22;
        array[0][6] =15;
        array[1][1] =11;
        array[1][5] =17;
        array[2][3] =-6;
        array[3][5] =39;
        array[4][0] =91;
        array[5][2] =28;
        System.out.println("输出原数组");
        //生成二维数组图像toGenerateAnArray
        toGenerateAnArray(array);
        int[][] result = setSparseArray(array);
        toGenerateAnArray(setSparseArray(array));
        toGenerateAnArray(array(result));



    }
    /**生成二维数组图像
     *
     * @param array
     */
    public static void toGenerateAnArray(int[][] array) {
        for (int[] ints : array) {
            for (int j : ints) {
                System.out.print(j + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("=============");
    }

    /**
     * 将一般数组转换为稀疏数组
     * @param array
     * @return
     */
    public static int[][] setSparseArray(int[][] array){
        System.out.println("生成稀疏数组");
        //计算有效值的个数
        int count = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] != 0) {
                    count++;
                }
            }
        }

        //创建一个稀疏数组
        int[][] result =new int[count+1][3];
        result [0][0] = array.length;
        result [0][1] = array[0].length;
        result [0][2] = count;


        //遍历二维数组。将非零的值。存放稀疏数组中
        count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]!=0){
                    result[count][0] = i;
                    result[count][1] = j;
                    result[count][2] = array[i][j];
                    count++;
                }
            }
        }

        return result;

    }

    /**
     * 将稀疏数组转换为一般数组
     * @param array
     * @return
     */
    public static int[][] array(int[][] array){
        int[][] result = new int[array[0][0]][array[0][1]];
        //初始化都为0
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = 0;
            }
        }
        //将稀疏数组存放到二维数组
        for (int i = 1; i < array.length; i++) {
                int a = array[i][0];
                int b = array[i][1];
                result[a][b] = array[i][2];
        }
        return result;
    }
}
