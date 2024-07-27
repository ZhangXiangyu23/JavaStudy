package practice.media;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName:test11
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/2 20:00
 */
public class test11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //接收字符串，可以接收空格
        String input = sc.nextLine();
        //分割为字符串数组
        String[] chr = input.split(",");
        int[] nums = new int[chr.length];
        for (int i = 0; i < nums.length; i++) {
            //将字符串类型的数字转化为整型
            nums[i] = Integer.parseInt(chr[i]);
        }


        //校验
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            b.add(nums[i]);
        }

        if(nums.length == b.size()){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
}
