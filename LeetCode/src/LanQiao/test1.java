package LanQiao;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/12 20:27
 */
public class test1 {
    public static void main(String[] args) {
        //将子串进行全排列，然后去重
        String str = "0100110001010001";
        //使用hashSet去重
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                //j+1是为了确保，能切出子串来
                set.add(str.substring(i, j+1));

            }

        }
        System.out.println(set.size());

    }
}
