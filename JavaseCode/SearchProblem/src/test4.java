/**
 * ClassName:test4
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/3 20:35
 *
 * 6 5 2
 * 2 4 1 3 2 3
 *
 *
 */

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int gcd = gcd(u, v); // 计算最大公约数
        int count = countSubarraysWithAvg(arr, u, v, gcd);
        System.out.println(count);
    }

    public static int countSubarraysWithAvg(int[] arr, int u, int v, int gcd) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0; // 使用long类型以防止溢出
            for (int j = i; j < n; j++) {
                sum += arr[j];
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

//     6 5 2
//     2 4 1 3 2 3
}


