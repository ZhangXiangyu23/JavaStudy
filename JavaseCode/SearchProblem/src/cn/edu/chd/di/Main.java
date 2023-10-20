package cn.edu.chd.di;

/**
 * ClassName:IslandTeleport
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/13 21:05
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IslandTeleport {
    private static List<List<Integer>> flights;
    private static boolean[] visited;
    private static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        flights = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            flights.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            flights.get(x).add(y);
            flights.get(y).add(x);
        }

        visited = new boolean[n + 1];
        count = 0;

        dfs(s, t);

        System.out.println(count);
    }

    private static void dfs(int island, int target) {
        visited[island] = true;

        if (island == target) {
            count++;
        } else {
            for (int neighbor : flights.get(island)) {
                if (!visited[neighbor]) {
                    dfs(neighbor, target);
                }
            }
        }

        visited[island] = false;
    }
}