package practice.XieCheng;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/28 20:11
 */
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 读取数组大小
        int[] arr = new int[n];    // 初始化数组

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // 读取数组元素
        }

        scanner.close();
        System.out.println(findMaxSumAfterOperation(arr));
    }

    private static long findMaxSumAfterOperation(int[] arr) {
        long totalSum = 0; // 数组的总和
        long maxIncrease = 0; // 执行操作后可能的最大增益
        long currentIncrease = 0; // 当前子数组的增益

        for (int num : arr) {
            totalSum += num; // 计算总和

            if (num % 2 == 0) { // 如果数字是偶数
                currentIncrease += (long)num / 2; // 可能的增益
                maxIncrease = Math.max(maxIncrease, currentIncrease); // 更新最大增益
            } else {
                currentIncrease = 0; // 遇到奇数，重置当前增益
            }
        }

        // 返回操作后的最大总和
        return totalSum + maxIncrease;
    }
}
