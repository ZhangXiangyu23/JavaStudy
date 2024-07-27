package practice.meituan;

/**
 * ClassName:test33
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/6 15:22
 */
import java.util.*;

class test33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            c[i] = scanner.nextInt();
        }
        scanner.close();

        int[] a = restoreArray(n, b, c);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    private static int[] restoreArray(int n, int[] b, int[] c) {
        int[] a = new int[n];
        int[] prefixSum = new int[n + 1];

        // 计算 b 数组对应的前缀和
        int sum = 0;
        for (int num : b) {
            sum += num;
            prefixSum[b.length] = sum;
        }
        for (int i = b.length - 1; i >= 0; i--) {
            prefixSum[i] = prefixSum[i + 1] - b[i];
        }

        // 求出 a 数组中被删除的元素
        int deleted = prefixSum[0];
        a[0] = deleted;

        // 还原 a 数组
        for (int i = 1; i < n; i++) {
            a[i] = prefixSum[i] - prefixSum[i - 1];
        }

        // 计算 c 数组对应的前缀和
        sum = 0;
        for (int num : c) {
            sum += num;
            prefixSum[c.length] = sum;
        }
        for (int i = c.length - 1; i >= 0; i--) {
            prefixSum[i] = prefixSum[i + 1] - c[i];
        }

        // 求出 a 数组中另一个被删除的元素
        int anotherDeleted = prefixSum[0];
        for (int i = 0; i < n; i++) {
            if (a[i] == anotherDeleted) {
                a[i] = deleted;
            }
        }

        return a;
    }
}