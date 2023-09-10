import java.util.Scanner;

public class OptimalStrategy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 题目数量
        int t = scanner.nextInt(); // 总时长

        int[][] dp = new int[n + 1][t + 1];
        char[][] choice = new char[n + 1][t + 1];

        for (int i = 1; i <= n; i++) {
            int ti1 = scanner.nextInt();
            int si1 = scanner.nextInt();
            int ti2 = scanner.nextInt();
            int si2 = scanner.nextInt();

            for (int j = 0; j <= t; j++) {
                dp[i][j] = dp[i - 1][j];
                choice[i][j] = 'F';

                if (j >= ti1 && dp[i][j] < dp[i - 1][j - ti1] + si1) {
                    dp[i][j] = dp[i - 1][j - ti1] + si1;
                    choice[i][j] = 'A';
                }

                if (j >= ti2 && dp[i][j] < dp[i - 1][j - ti2] + si2) {
                    dp[i][j] = dp[i - 1][j - ti2] + si2;
                    choice[i][j] = 'B';
                }
            }
        }

        // 还原题目选择策略
        StringBuilder strategy = new StringBuilder();
        int timeLeft = t;
        for (int i = n; i > 0; i--) {
            char ch = choice[i][timeLeft];
            strategy.insert(0, ch);
            if (ch == 'A') {
                timeLeft -= scanner.nextInt();
            } else if (ch == 'B') {
                timeLeft -= scanner.nextInt();
            }
        }

        System.out.println(strategy.toString());
    }
}
