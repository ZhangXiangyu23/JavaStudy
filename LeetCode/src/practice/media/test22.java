package practice.media;

import java.util.Scanner;

/**
 * ClassName:test22
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/3 22:04
 */
public class test22 {
    public static void main(String[] args) {
        //接收字符串
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //提取数字
        String[] a = input.split(" ");


        if(a.length < 2){
            System.out.println(-1);
        }else {
            int num1 = Integer.parseInt(a[0]);
            int num2 = Integer.parseInt(a[1]);

            int yushu = num1 % num2;
            if (yushu == 0){
                System.out.println(num2);
            }
            //辗转相除
            while(yushu != 0){
                num1 = num2;
                num2 = yushu;
                yushu = num1 % num2;
            }
            System.out.println(num2);
        }
    }
}
