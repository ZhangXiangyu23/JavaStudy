package practice.Tencent;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/31 21:28
 */
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 节点数量
        int m = scanner.nextInt(); // 边的数量

        int[] totalEdges = new int[n + 1]; // 存储每个节点连接的边的总数
        int[] redEdges = new int[n + 1]; // 存储每个节点连接的红边的数量

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            char chr = scanner.next().charAt(0); // 边的颜色

            // 增加边的总数
            totalEdges[u]++;
            totalEdges[v]++;

            // 如果是红边，增加红边的数量
            if (chr == 'R') {
                redEdges[u]++;
                redEdges[v]++;
            }
        }

        int goodPointsCount = 0;
        for (int i = 1; i <= n; i++) {
            // 如果节点的红边数量等于它连接的边的总数或者该节点没有任何邻边，它是好点
            if (redEdges[i] == totalEdges[i]) {
                goodPointsCount++;
            }
        }

        // 输出好点的数量
        System.out.println(goodPointsCount);

        scanner.close();
    }
}
