package LanQiao;

/**
 * ClassName:test5
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/12 22:08
 */
public class test5 {
    public static void main(String[] args) {
        //将数字转化为字符串
        int i = 10;
        String str = String.valueOf(10);
        System.out.println(str);

        //将字符串转化为数字
        int b = Integer.parseInt(str);
        System.out.println(b);

        //A的ASCII码为65
        //Z是90
        //a的ASCII码为97
        //z是122

        String k = "akshxnlo";
        System.out.println(k.indexOf("a"));


        //格式化输出一个浮点型的整数数字
        double lxy = 3.1415926;
        System.out.printf("%.2f", lxy);

    }
}
