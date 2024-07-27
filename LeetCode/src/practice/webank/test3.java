package practice.webank;

import java.util.Scanner;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/7 19:46
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] results = new int[T];

        for (int i = 0; i < T; i++) {
            int x = scanner.nextInt();
            int s = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            //模拟
            if (play(x, s, a, b, c, d)){
                results[i] = 1;
            }else {
                results[i] = 2;
            }

        }

        for (int i = 0; i < T; i++) {
            System.out.println(results[i]);

        }
    }

    private static boolean play(int x, int s, int a, int b, int c, int d) {
        if (x >= s){
            return true;
        }
        if (x < s && x + b < s){
            for (int i = a; i <= b; i++) {

                if (!play(x+i, s, a, b, c, d)){
                    return true;
                }
            }
        }

        if (x < s && x+d >= s){
            for (int i = c; i <= d; i++) {
                if (play(x+i, s, a, b, c, d)){
                    return true;
                }

            }
        }
        return false;
    }

}
