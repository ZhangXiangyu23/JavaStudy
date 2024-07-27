package practice.huifeng;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * ClassName:test22
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/16 11:37
 */
public class test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M= scanner.nextInt();

        Map<Integer, Integer> product = new HashMap<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int productId = scanner.nextInt();
                product.put(productId, product.getOrDefault(productId, 0) + 1);
            }

        }

        int K = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            if (product.get(a).equals(product.get(b))){
                return a - b;
            }
            return  product.get(b) - product.get(a);
        });

        for (int productId: product.keySet()) {
            if (product.get(productId) >= K){
                pq.offer(productId);
            }
        }

        while (!pq.isEmpty()){
            System.out.println(pq.poll() + " ");
        }

    }
}
