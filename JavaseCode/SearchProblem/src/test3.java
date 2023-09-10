/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/3 20:02
 */
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = countSubarraysWithAvg(arr, u, v);
        System.out.println(count);
    }
    public static int countSubarraysWithAvg(int[] arr, int u, int v) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0; // 使用long类型以防止溢出
            for (int j = i; j < n; j++) {
                sum += arr[j];
                // 计算分子分母的最大公约数
                int gcd = gcd(u, v);
                if (sum * v == u * (j - i + 1) * gcd) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
