package zxy.JiTiao03;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/26 14:57
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 0){
            System.out.println(0);
            return;
        }
        int[] prices = new int[n];
        //输入股票价格
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int longest = 1;

        int current = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                // 当前价格比前一天高，连续上涨天数加一
                current++;
            } else {
                // 当前价格不比前一天高，重置连续上涨天数
                current = 1;
            }

            // 更新最长连续上涨天数
            longest = Math.max(longest, current);
        }
        // 输出结果
        System.out.println(longest);

    }


}

