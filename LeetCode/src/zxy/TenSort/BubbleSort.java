package zxy.TenSort;

/**
 * ClassName:BubbleSort
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/7/27 18:21
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {520, 33, 66, -17, 0, 520, 25};
        System.out.println("排序之前");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("排序之后");
        //调用函数
        sort(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }


    }

    public static void sort(int[] arr){
        //冒泡排序
        //趟数
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                //在比较的过程中，往前移动
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

    }
}
