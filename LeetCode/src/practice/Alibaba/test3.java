package practice.Alibaba;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/8 20:33
 */
import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(countReachablePairs(arr));
    }

    public static long countReachablePairs(int[] arr) {
        int n = arr.length;
        int[] inDegree = new int[n + 1];
        long[] outDegree = new long[n + 1];

        for (int i = 0; i < n; i++) {
            inDegree[arr[i]]++;
            outDegree[arr[i]] += i;
        }

        long totalPairs = 0;
        for (int i = 1; i <= n; i++) {
            totalPairs += (long) inDegree[i] * (n - 1) - outDegree[i];
        }

        return totalPairs;
    }
}

