package practice.Tencent;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/31 20:35
 */
import java.util.Scanner;

import java.util.Scanner;

import java.util.*;

import java.util.*;

public class test3 {
    static int[] parent;
    static int[] size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 初始化并查集
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // 读取边，合并连通分量
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            union(u, v);
        }

        // 找出所有连通分量并计算它们的大小
        HashMap<Integer, Integer> componentSizeMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int root = find(i);
            componentSizeMap.put(root, componentSizeMap.getOrDefault(root, 0) + 1);
        }

        if (componentSizeMap.size() != 2) {
            // 如果连通分量不是两个，无法通过添加一条边使图连通
            System.out.println(0);
        } else {
            // 如果恰好有两个连通分量，计算两者之间可以添加的边的数量
            long ways = 1;
            for (int size : componentSizeMap.values()) {
                ways *= size;
            }
            System.out.println(ways);
        }
    }

    // 并查集的查找
    public static int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // 并查集的合并
    public static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (size[rootX] < size[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
            }
        }
    }
}
