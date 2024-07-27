package practice.media;

import java.util.Scanner;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/28 10:54
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();
        String[] numStr = input.split(" ");
        if (numStr.length < 2){
            System.out.println(-1);
        }else {
            long num1 = Long.parseLong(numStr[0]);
            long num2 = Long.parseLong(numStr[1]);


            if (num2 == 0 || num1 == 0){
                System.out.println(0);
            }else {
                System.out.println(panduan(num1, num2));

            }




        }



    }

    public static  long panduan(long a, long b){
        //辗转相除
        while (b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
