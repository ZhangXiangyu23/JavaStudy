package practice.webank;

import java.util.Scanner;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/7 19:45
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //输入n
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] s = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < n; i++) {
            int option = scanner.nextInt();
            perform(s, option);
        }

        //输出
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void perform(int[][] s, int option){
        if(option <= 3){
            shuiping(s, option-1);
        }else {
            shuzhi(s,option-4);
        }
    }



    private static void shuiping(int[][] s, int row) {
        int[] temp = s[row];
        s[row] = new int[]{temp[2], temp[0], temp[1]};
    }

    private static void shuzhi(int[][] s, int col) {
        int temp = s[2][col];
        s[2][col] = s[0][col];
        s[0][col] = s[1][col];
        s[1][col] = temp;
    }




}
