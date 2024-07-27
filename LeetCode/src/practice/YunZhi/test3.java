package practice.YunZhi;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/11 21:01
 */

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        System.out.println(countSubstrings(s));
    }

    private static long countSubstrings(String s) {
        long count = 0;
        int lastR = -1, lastE = -1, lastD = -1;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            // 更新'r'、'e'、'd'的最新位置
            if (ch == 'r') lastR = i;
            if (ch == 'e') lastE = i;
            if (ch == 'd') lastD = i;

            // 如果'r'和'e'都已经找到，且它们出现的位置在最近的'd'之后
            // 那么从lastR和lastE中较小的那个位置到当前位置，都是符合条件的新子串
            if (lastR >= 0 && lastE >= 0 && lastD < Math.min(lastR, lastE)) {
                count += (Math.min(lastR, lastE) - lastD);
            }
        }

        return count;
    }
}

