package cn.edu.chd.di2;

/**
 * ClassName:ChessBoardPaths
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/18 19:38
 */
public class ChessBoardPaths {
    public static int calculatePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        // 初始化边界条件
        dp[0][0] = 1;

        // 计算中间位置的总路线数
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 1;

        int paths = calculatePaths(m, n);
        System.out.println(paths);
    }
}
