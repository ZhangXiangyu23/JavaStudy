package practice.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/6 9:48
 */
public class test1 {
    public static void main(String[] args) {
        //输入一个整数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> codes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String code = scanner.nextLine().trim();
            codes.add(code);

        }

        //输出结果
        for (String code: codes) {
            System.out.println(panduan(code));
        }

        scanner.close();

    }


    //判断函数
    public static String panduan(String code){
        //分离
        String[] part = code.split("-");
        if (part.length != 4){
            return "no";
        }

        //提取各部分
        String A = part[0];
        String BCD = part[1];
        String EFGHI =part[2];
        String J = part[3];

        //校验是不是整型
        if (! isInteger(A)){
            return "no";
        }
        //校验第二部分
        if(! isSame(BCD)){
            return  "no";
        }
        //校验第三部分
        if (! isLianxu(EFGHI)){
            return "no";
        }

        //校验第四部分
        int total = Integer.parseInt(A);
        int weight = 2;
        for (char d: (BCD + EFGHI).toCharArray()) {
            total += Character.getNumericValue(d) * weight;
            weight++;
        }
        int r = total % 11;
        String shuzi = (r == 10) ? "X" : String.valueOf(r);

        if (!J.equals(shuzi)){
            return "no";
        }
        return "yes";


    }

    public static boolean isInteger(String str){
        int num = Integer.parseInt(str);
        if (num > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isSame(String str){
        return str.matches("\\d{3}") && !str.matches("(\\d)\\1{2}");
    }

    public static boolean isLianxu(String str){
        return str.matches("\\d{5}") && !str.matches("01234|12345|23456|34567|45678|56789");
    }


}
