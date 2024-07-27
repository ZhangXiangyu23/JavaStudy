package LanQiao;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName:test4
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/12 21:17
 */
public class test4 {
    public static void main(String[] args) {
        //将字符串转化为字符数组处理
        String str = "abcd";
        //将其逐个字符进行拆分
        char[] a = a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("------------------------");
        //取字符串中指定位置的字符
        System.out.println(str.charAt(0));
        System.out.println("------------------------");

        //使用stringbuilder
        StringBuilder s = new StringBuilder("zxy");
        System.out.println(s.append("nb"));

        System.out.println("------------------------");
        //生成一个10以内的随机数
        int x = new Random().nextInt(10);
        System.out.println(x);

        System.out.println("------------------------");

        //求中间值
        int low = 0;
        int high = 5;
        System.out.println(low + ((high - low)>>1));

        //其他类型转化为字符串类型
        System.out.println("------------------------");
        System.out.println(String.valueOf(123) instanceof  String);

        //从字符串中提取数字
        System.out.println("------------------------");
        System.out.println(Integer.parseInt("123") + 100);

        System.out.println("------------------------");
        //输入输出
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int y = scanner.nextInt();
        System.out.println(y);

        //可以接收空格和回车键的
        String m = scanner.next();
        System.out.println(m);

//        System.out.println("********************");
        //可以吃回车键
        String l = scanner.nextLine();
        System.out.println(l);


    }
}

