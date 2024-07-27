package LanQiao;

import java.util.Scanner;

/**
 * ClassName:test7
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/12 22:37
 */
public class test7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //分离百位
        int b = a / 100;
        //分离十位
        int c = (a/10) % 10;
        //分离个位
        int d = a % 10;

        if ((b*b*b)+(c*c*c)+(d*d*d) == a){
            System.out.println("是水仙花数");
        }else{
            System.out.println("不是水仙花数");
        }

    }

}
