package practice.Tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:test4
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/31 21:37
 */
public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 初始化dp数组
        int[][] dp = new int[n+1][k+1];
        for(int[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        dp[0][0] = 0; // 基础情况

        // 动态规划填表
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= k; j++) {
                int xor = 0;
                for(int m = i; m >= j; m--) { // 枚举最后一段的起始位置
                    xor ^= arr[m]; // 计算这一段的异或和
                    dp[i][j] = Math.max(dp[i][j], dp[m-1][j-1] + xor); // 更新dp表
                }
            }
        }

        // 输出结果
        System.out.println(dp[n][k]);
    }
}

