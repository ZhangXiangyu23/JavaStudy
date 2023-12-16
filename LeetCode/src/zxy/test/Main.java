package zxy.test;

import java.util.Arrays;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/12 20:32
 */
public class Main {
    public static void main(String[] args) {
        int[] dp = new int[10];
        //初始化dp数组
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }

    }
}
