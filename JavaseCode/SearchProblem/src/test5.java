/**
 * ClassName:test5
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/3 20:43
 */
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0; // 用于计数平均值等于u/v的子区间个数

        for (int i = 0; i < n; i++) {
            int sum = 0; // 记录子区间的和
            int num = 0; // 记录子区间的元素个数
            for (int j = i; j < n; j++) {
                sum += arr[j];
                num++;
                // 计算子区间的平均值，并将分子分母约分为最简分数
                int gcd = gcd(sum, num);
                int numerator = sum / gcd;
                int denominator = num / gcd;
                // 检查平均值是否等于u/v
                if (numerator == u && denominator == v) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    // 求最大公约数的辅助函数
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
