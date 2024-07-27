package practice.XieCheng;

/**
 * ClassName:test4
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/28 19:36
 */
import java.util.Scanner;
import java.util.HashMap;

import java.util.Scanner;

import java.util.Scanner;
import java.util.HashMap;

import java.util.Scanner;
import java.util.HashMap;

public class test4 {

    // 计算 x 的质因数，并更新到 map 中
    private static void factorizeAndAdd(int x, HashMap<Integer, Integer> map) {
        for (int i = 2; i * i <= x; i++) {
            while (x % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                x /= i;
            }
        }
        if (x > 1) { // 如果 x 本身是质数
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 读取 n
        HashMap<Integer, Integer> factorMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            // 计算每个数的阶乘的质因数分解，并累加
            for (int j = 2; j <= a; j++) {
                factorizeAndAdd(j, factorMap);
            }
        }

        long result = 1;
        for (int count : factorMap.values()) {
            result = result * (count + 1) % 1000000007;
        }

        System.out.println(result);
    }
}
