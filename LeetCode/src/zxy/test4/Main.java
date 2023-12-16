package zxy.test4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/12 15:44
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入数组的长度
        int n = scanner.nextInt();
        if(n == 0 || n== -1){
            System.out.println(0);
            return;
        }
        //new一个数组
        int[] a = new int[n];
        //输入第二行
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(a[i] > a[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int result = 1;
        for(int i=0; i<dp.length;i++){
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);



    }
}
