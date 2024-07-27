package practice.Iyunzhi;

import java.util.Scanner;

/**
 * ClassName:test1U^_U]SXEPYDS@SDOB^_XQ
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/18 14:54
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ened = scanner.nextLine();
        String key = "CHICKENS";

        StringBuilder deKey = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char c = (char) (ened.charAt(i) ^ key.charAt(i));
            deKey.append(c);
        }

        StringBuilder deed  = new StringBuilder();
        for (int i = 0; i < ened.length(); i++) {
            char c = (char) (ened.charAt(i) ^ deKey.charAt(i % 8));
            deed.append(c);

        }

        System.out.println(deed.toString());
    }

}
