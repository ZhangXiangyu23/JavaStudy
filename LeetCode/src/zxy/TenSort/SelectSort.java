package zxy.TenSort;

/**
 * ClassName:SelectSort
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/7/27 18:13
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {33, 520, 6, -4, 520, 18, 26};
        System.out.println("排序之前");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        //调函数
        sort(arr);

        System.out.println("排序之后");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
