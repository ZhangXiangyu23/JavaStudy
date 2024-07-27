package practice.YunZhi;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/11 20:53
 */
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 读取数据组数t
        int[] res = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // 读取数组长度n
            int[] arr = new int[n]; // 创建数组用于存储输入的整数
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt(); // 读取数组中的每个整数
            }
            res[i] = findPairs(arr);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
        scanner.close();
    }

    private static int findPairs(int[] arr) {
        int count = 0; // 用于计数满足条件的数对
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // 检查两数之和是否等于两数的异或结果
                if (arr[i] + arr[j] == (arr[i] ^ arr[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
