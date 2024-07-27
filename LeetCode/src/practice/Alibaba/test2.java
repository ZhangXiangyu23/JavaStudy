package practice.Alibaba;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/8 19:42
 */
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        // 读取蛋糕数量和步骤数量
        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] c = new int[k];
        int[] t = new int[k];
        // 读取每个步骤的人数和时间
        for (int i = 0; i < k; i++) {
            c[i] = scanner.nextInt();
            t[i] = scanner.nextInt();
        }
        scanner.close();

        // 计算最少需要的时间
        int result = minTime(n, k, c, t);
        System.out.println(result);
    }

    private static int minTime(int n, int k, int[] c, int[] t) {
        // 计算每个步骤所需的最少时间
        int[] stepTimes = new int[k];
        for (int i = 0; i < k; i++) {
            stepTimes[i] = (int)Math.ceil((double)n / c[i]) * t[i];
        }

        // 找出所有步骤中所需时间最长的那个
        int maxTime = stepTimes[0];
        for (int time : stepTimes) {
            if (time > maxTime) {
                maxTime = time;
            }
        }

        return maxTime;
    }
}
