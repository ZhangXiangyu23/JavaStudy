package practice.PDD;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/15 20:38
 */
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        long result = calculateJumpingScore(arr);
        System.out.println(result * 2);
    }

    private static long calculateJumpingScore(int[] arr) {
        long jumpingScore = 0;
        long totalScore = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                jumpingScore += arr[i];
                totalScore += jumpingScore;
                totalScore %= 10000007;
            } else {
                jumpingScore = 0;
            }
        }
        return totalScore;
    }
}
