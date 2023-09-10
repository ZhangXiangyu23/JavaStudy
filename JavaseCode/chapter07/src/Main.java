import java.util.Scanner;

/*
3 10
4 10 2 5
4 20 2 5
6 20 1 15
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[][] problems = new int[n][4];

        for (int i = 0; i < n; i++) {
            problems[i][0] = scanner.nextInt(); // ti1
            problems[i][1] = scanner.nextInt(); // si1
            problems[i][2] = scanner.nextInt(); // ti2
            problems[i][3] = scanner.nextInt(); // si2
        }

        int[][] dp = new int[n + 1][t + 1];
        char[][] strategy = new char[n + 1][t + 1];

        for (int i = 1; i <= n; i++) {
            int ti1 = problems[i - 1][0];
            int si1 = problems[i - 1][1];
            int ti2 = problems[i - 1][2];
            int si2 = problems[i - 1][3];

            for (int j = 0; j <= t; j++) {
                dp[i][j] = dp[i - 1][j];
                strategy[i][j] = 'F';

                if (j >= ti1 && dp[i - 1][j - ti1] + si1 > dp[i][j]) {
                    dp[i][j] = dp[i - 1][j - ti1] + si1;
                    strategy[i][j] = 'A';
                }

                if (j >= ti2 && dp[i - 1][j - ti2] + si2 > dp[i][j]) {
                    dp[i][j] = dp[i - 1][j - ti2] + si2;
                    strategy[i][j] = 'B';
                }
            }
        }

        StringBuilder result = new StringBuilder();
        int totalTime = t;

        for (int i = n; i > 0; i--) {
            char chosenStrategy = strategy[i][totalTime];
            result.append(chosenStrategy);

            if (chosenStrategy == 'A') {
                totalTime -= problems[i - 1][0];
            } else if (chosenStrategy == 'B') {
                totalTime -= problems[i - 1][2];
            }
        }

        System.out.println(result.reverse().toString());
    }
}
