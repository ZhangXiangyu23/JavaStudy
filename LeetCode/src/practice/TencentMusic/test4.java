package practice.TencentMusic;

/**
 * ClassName:test4
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/18 19:37
 */
import java.io.*;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // 读取输入的第一行，假设格式为："s,k"

        // 分割输入数据获取字符串s和整数k
        String[] parts = input.split(",");
        String s = parts[0].trim();
        int k = Integer.parseInt(parts[1].trim());

        int result = minimizeMaxSubstringLength(s, k);
        System.out.println(result);  // 输出结果
    }

    public static int minimizeMaxSubstringLength(String s, int k) {
        int left = 1, right = s.length();
        while (left < right) {
            int mid = (left + right) / 2;
            if (isPossible(s, mid, k)) {
                right = mid;  // 尝试一个更小的L
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean isPossible(String s, int maxLength, int k) {
        int count = 0;  // 用来记录需要的操作数
        int currentLength = 0;  // 当前连续的'1'的长度

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    count += (currentLength - 1) / maxLength;  // 减1再除以maxLength计算需要分割的次数
                }
                currentLength = 0;
            }
        }

        // 处理字符串末尾是'1'的情况
        if (currentLength > maxLength) {
            count += (currentLength - 1) / maxLength;
        }

        return count <= k;  // 如果计算的操作次数不超过k，说明是可行的
    }
}
