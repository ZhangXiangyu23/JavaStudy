package practice.PDD;

/**
 * ClassName:test22
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/15 20:52
 */
import java.util.Scanner;

import java.util.Scanner;

import java.util.*;

public class test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(subarrayJumpScore(array, N));
    }

    private static long subarrayJumpScore(int[] array, int N) {
        long totalScore = 0;
        int MOD = 10000007;

        // 计算每个元素在子数组中出现的次数
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int i = 0; i < N; i++) {
            elementCount.put(array[i], elementCount.getOrDefault(array[i], 0) + 1);
        }

        // 计算每个元素的跃动得分并累加
        for (int i = 0; i < N; i++) {
            int score = 0;
            int count = elementCount.get(array[i]);
            if (count >= 2) {
                score = (int)(((long)array[i] * count * (count - 1) / 2) % MOD);
            }
            totalScore = (totalScore + score) % MOD;
        }

        return totalScore;
    }
}
