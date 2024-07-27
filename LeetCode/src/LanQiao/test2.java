package LanQiao;

import java.util.Arrays;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/12 20:38
 */
public class test2 {

    public static void main(String[] args) {
        //对一个数组进行排序
        int[] arr = {5, 10, 1, -8, -7, 3, 2, 12};
        //排序前输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("--------------------------");

        //进行排序
        Arrays.sort(arr);
        //排序之后输出

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
