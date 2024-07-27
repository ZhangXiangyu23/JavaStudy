package practice.XieCheng;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/28 18:44
 */
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取矩阵的行数和列数
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // 跳过当前行以读取下一行
        int operations = 0;

        for (int i = 0; i < n; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                // 当前字符是'0'，需要进行操作
                if (row.charAt(j) == '0') {
                    operations++;
                    // 如果当前0不是最后一列，跳过下一个字符（因为1*2的操作可以同时覆盖两个字符）
                    if (j < m - 1) {
                        j++;
                    }
                }
            }
        }

        System.out.println(operations);
    }
}

