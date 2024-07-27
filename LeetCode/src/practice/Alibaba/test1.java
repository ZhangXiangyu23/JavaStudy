package practice.Alibaba;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/8 20:10
 */
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 消耗掉换行符

        char[][] square = new char[n][n];
        for (int i = 0; i < n; i++) {
            square[i] = scanner.nextLine().toCharArray();
        }

        int startX = scanner.nextInt() - 1;
        int startY = scanner.nextInt() - 1;
        scanner.close();

        System.out.println(stepsToExit(square, startX, startY, n));
    }

    private static int stepsToExit(char[][] square, int x, int y, int n) {
        int[][] visited = new int[n][n]; // 用来记录访问过的格子和对应的步数
        int steps = 0;
        while (true) {
            if (x < 0 || x >= n || y < 0 || y >= n) {
                // 走出了广场
                return steps;
            }

            if (visited[x][y] != 0) {
                // 之前已经访问过这个格子，且箭头方向相同，说明进入循环
                return -1;
            }

            visited[x][y] = ++steps; // 更新步数

            // 根据箭头方向更新位置，并反转箭头方向
            switch (square[x][y]) {
                case '^':
                    square[x][y] = 'v';
                    x--;
                    break;
                case 'v':
                    square[x][y] = '^';
                    x++;
                    break;
                case '<':
                    square[x][y] = '>';
                    y--;
                    break;
                case '>':
                    square[x][y] = '<';
                    y++;
                    break;
            }
        }
    }
}