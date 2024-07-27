package practice.smallRedBook;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/26 19:49
 */
import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    static int n, x;
    static int[] a;
    static int[][][] memo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x = scanner.nextInt();
        a = new int[n];
        memo = new int[n][x + 1][2]; // Array size needs to be x + 1 to accommodate all possible values of x

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Initialize the memoization array with -1 (indicating uncomputed values)
        for (int[][] twoD : memo)
            for (int[] oneD : twoD)
                Arrays.fill(oneD, -1);

        int ans = helper(0, x, false);
        if (ans == n + 1) System.out.println(-1);
        else System.out.println(ans);

        scanner.close();
    }

    private static int helper(int i, int x, boolean extra) {
        if (x == 0) return 0;
        if (i >= n) return n + 1;
        if (memo[i][x][extra ? 1 : 0] != -1) return memo[i][x][extra ? 1 : 0];

        // No action taken
        int no = helper(i + 1, x, extra);

        // Send once
        int one = n + 1;
        if (x >= a[i] / 2) {
            one = helper(i + 1, x - a[i] / 2, extra) + 1;
        }

        // Send multiple times
        int multi = n + 1;
        if (x >= a[i] && !extra) {
            multi = helper(i + 1, x - a[i], true) + 1;
        }

        memo[i][x][extra ? 1 : 0] = Math.min(no, Math.min(one, multi));
        return memo[i][x][extra ? 1 : 0];
    }
}

