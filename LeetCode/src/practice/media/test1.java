package practice.media;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/3/28 10:37
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numStr = input.split(",");

        int[] nums = new int[numStr.length];
        for (int i = 0; i < numStr.length; i++) {
            nums[i] = Integer.parseInt(numStr[i]);
        }

        System.out.println(jiaoyan(nums));




    }

    public static boolean jiaoyan(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for (int num: nums) {
            if(numSet.contains(num)){
                return true;
            }else {
                numSet.add(num);
            }

        }
        return false;
    }

}
