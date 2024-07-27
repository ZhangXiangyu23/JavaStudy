package practice.Alibaba;

/**
 * ClassName:test33
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/8 20:35
 */
import java.util.*;

public class test33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] permutation = new int[n];
        for (int i = 0; i < n; i++) {
            permutation[i] = scanner.nextInt();
        }

        System.out.println(countPairs(n, permutation));
    }

    public static int countPairs(int n, int[] permutation) {
        int[] indegree = new int[n + 1];
        for (int i = 0; i < n; i++) {
            indegree[permutation[i]]++;
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += indegree[i + 1];
        }

        return (int) result;
    }
}

