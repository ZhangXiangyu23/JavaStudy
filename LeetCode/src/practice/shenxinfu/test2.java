package practice.shenxinfu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/6/11 20:01
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();


        int[] results = new int[T];
        while (T-- > 0){
            int n  = scanner.nextInt();
            int k  = scanner.nextInt();
            int[] tasks = new int[n];
            for (int i = 0; i < n; i++) {
                tasks[i] = scanner.nextInt();
            }
            results[T] = solve(n,k,tasks);
        }
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);

        }
    }

    public static int solve(int n, int k, int[] tasks){
        Arrays.sort(tasks);

        int minTime = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            int maxTime = 0;
            for (int j = 0; j < i; j++) {
                maxTime = Math.max(maxTime, tasks[j]);
            }

            for (int j = n-(k-i); j < n; j++) {
                maxTime = Math.max(maxTime, tasks[j]);
            }
            minTime = Math.min(minTime, maxTime);

        }
        return minTime;
    }
}
