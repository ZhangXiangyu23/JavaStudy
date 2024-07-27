package practice.Sort;

/**
 * ClassName:BubbleSort
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/21 17:18
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 10, -2, -8, 15};
        //排序之前
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //排序
        fun(a);


        System.out.println();
        //排序之后
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void fun(int[] a){
        //排序趟数
        for (int i = 0; i < a.length-1; i++) {
            //每趟比较个数,每比完一趟，就少一个
            for (int j = 0; j < (a.length-i-1); j++) {
                if (a[j] > a[j+1]){
                    //交换
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
}
