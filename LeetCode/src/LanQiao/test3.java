package LanQiao;

import java.util.Map;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/12 20:42
 */
public class test3 {
    public static void main(String[] args) {
        //将一个10进制的数转化为2进制
        int num = 7;
        //111
        System.out.println(Integer.toString(num, 2).getClass().getName());

        String str = "123";
        //判断是不是字符串类型
        System.out.println(str.getClass().getName());
        System.out.println(str instanceof String);
        Integer i = 5;
        System.out.println(i instanceof Integer);

    }
}
