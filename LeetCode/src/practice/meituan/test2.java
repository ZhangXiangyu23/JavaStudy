package practice.meituan;

import java.util.Scanner;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/6 9:48
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //输入n
        int n = scanner.nextInt();
        scanner.nextLine();
        //读取数组
        String line = scanner.nextLine();
        //进行分割
        String[] nums = line.split(" ");
        int cout = 0;

        for (String num : nums) {
            //进行判断
            if (!num.contains("i") || num.endsWith("+0i") || num.endsWith("-0i")){
                cout++;
            }
        }

        System.out.println(cout);
    }

}
