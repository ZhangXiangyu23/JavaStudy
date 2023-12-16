package zxy.JiTiao01;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/26 14:31
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入
        int n = scanner.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }

        // 输出结果
        String result = canAllocateTeams(n, ages);
        System.out.println(result);
    }

    private static String canAllocateTeams(int n, int[] ages) {
        int totalAge = 0;
        for (int age : ages) {
            totalAge += age;
        }

        if (totalAge % 2 != 0) {
            return "No"; // 如果总年龄是奇数，无法平均分配
        }

        int targetAge = totalAge / 2;

        boolean[] dp = new boolean[targetAge + 1];
        dp[0] = true;

        for (int age : ages) {
            for (int i = targetAge; i >= age; i--) {
                dp[i] = dp[i] || dp[i - age];
            }
        }

        return dp[targetAge] ? "Yes" : "No";
    }
}
