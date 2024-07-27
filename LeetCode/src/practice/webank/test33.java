package practice.webank;

import java.util.Scanner;

/**
 * ClassName:test33
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/7 21:06
 */
public class test33 {
    public static int play(int x, int s, int a,int b, int c, int d){
        if (s -x <= b){
            return 1;
        }
        if (s - (x+b) <= d){
            return 2;
        }
        if (b >= d){
            return 1;
        }else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        int[] res = new int[T];

        for (int i = 0; i < T; i++) {
            int x = scanner.nextInt();
            int s = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            res[i] = play(x, s, a, b, c, d);

        }
        for (int i = 0; i < T; i++) {
            System.out.println(res[i]);

        }


        scanner.close();
    }
}
