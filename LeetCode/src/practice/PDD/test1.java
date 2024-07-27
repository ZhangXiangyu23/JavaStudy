package practice.PDD;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/15 19:19
 */
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 字符串长度
        scanner.nextLine(); // 消费换行符
        String s = scanner.nextLine(); // 读取字符串

        int[] cost = new int[N];
        int maxPDD = 0;
        int minCost = 0;

        // 初始化成本数组
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.MAX_VALUE;
        }

        // 动态规划求最小成本
        for (int i = 2; i < N; i++) {
            if (s.charAt(i - 2) == 'P' && s.charAt(i - 1) == 'D' && s.charAt(i) == 'D') {
                cost[i] = 0; // 已经是PDD
            } else {
                int pCost = Math.abs('P' - s.charAt(i - 2));
                int d1Cost = Math.abs('D' - s.charAt(i - 1));
                int d2Cost = Math.abs('D' - s.charAt(i));
                cost[i] = pCost + d1Cost + d2Cost;
            }

            // 更新得分和最小成本
            if (cost[i] < Integer.MAX_VALUE) {
                maxPDD++;
                minCost += cost[i];
            }
        }

        // 输出结果
        System.out.println(maxPDD + " " + minCost);
        scanner.close();
    }
}
