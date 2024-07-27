package practice.Iyunzhi;

import java.util.Scanner;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/18 14:54
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(fun(m, n, k));

    }

    public static int fun(int m, int n, int k){
        if(k > n){
            return -1;
        }
        int left = k-1;
        int right = n - k;
        int used = n;

        int ln = 0;
        int rn = 0;
        int count = 1;

        for (int i = 1; i <= n && used <= m;){
            count++;
            used += i;
            if (used >= m){
                return used > m ? count - 1:count;
            }

            i += ln >= left ? 0 : 1;
            i += rn >= right ? 0 : 1;
            ln++;
            rn++;

        }

        return -1;

    }
}
