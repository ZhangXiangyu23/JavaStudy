package practice.Tencent;

import java.util.Scanner;

/**
 * ClassName:test5
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/31 21:44
 */
public class test5 {
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右、下、左、上
    private static final String TARGET = "tencent";
    private static int n, m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine(); // 跳过行尾的换行符
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }
        System.out.println(findWays(matrix));
    }

    private static int findWays(char[][] matrix) {
        int[][][] dp = new int[n][m][TARGET.length() + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == TARGET.charAt(0)) {
                    dp[i][j][1] = 1; // 初始化匹配第一个字符的情况
                }
            }
        }

        for (int k = 1; k < TARGET.length(); k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == TARGET.charAt(k)) {
                        for (int[] dir : DIRECTIONS) {
                            int x = i + dir[0], y = j + dir[1];
                            if (x >= 0 && x < n && y >= 0 && y < m) {
                                dp[i][j][k + 1] += dp[x][y][k];
                            }
                        }
                    }
                }
            }
        }

        int totalWays = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalWays += dp[i][j][TARGET.length()];
            }
        }

        return totalWays;
    }
}
