package practice.webank;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/7 19:46
 */
public class test2 {

    public static class Edge implements Comparable<Edge> {
        int src, dest, weight;
        public int compareTo(Edge compareEdge){
            return this.weight - compareEdge.weight;
        }
    }

    public static class find{
        int[] parent, rank;
        int n;
        public find(int n){
            this.n = n;
            this.parent = new int[n];
            this.rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;

            }
        }
        public int find(int i){
            if (parent[i] != i){
                parent[i] = find(parent[i]);
            }
            return parent[i];
        }

        public void union(int x, int y){
            int xRoot = find(x), yRoot =find(y);
            if (xRoot == yRoot){
                return;
            }

            if (rank[xRoot] < rank[yRoot]){
                parent[xRoot] = yRoot;
            }else if (rank[yRoot] < rank[xRoot]){
                parent[yRoot] = xRoot;
            }else {
                parent[yRoot] = xRoot;
                rank[xRoot]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int C = scanner.nextInt();

        int total = N * (N-1) / 2;
        Edge[] edges = new Edge[total];
        for (int i = 0; i < total; i++) {
            edges[i] = new Edge();
            edges[i].src = scanner.nextInt() - 1;
            edges[i].dest =scanner.nextInt() - 1;
            edges[i].weight =scanner.nextInt();

        }

        Arrays.sort(edges);
        find f = new find(N);
        int Cost = 0;
        for (Edge e: edges) {
            int x = f.find(e.src);
            int y = f.find(e.dest);

            if (x != y){
                Cost += e.weight * C;
                f.union(x, y);
            }

        }
        System.out.println(Cost);
        scanner.close();
    }
}
