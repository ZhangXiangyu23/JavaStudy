package zxy.array04;

import java.util.*;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/18 21:25
 */
public class Main {
    public static void main(String[] args) {
        int[] nums ={2,3,1,2,4,3};
        int target = 7;
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(target, nums));

    }
}


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
            List<Integer> result = new ArrayList<>();
            List<Integer> len = new ArrayList<>();
            //控制左边界
            for (int i = 0; i < nums.length; i++) {
                result.clear();
                int sum = 0;
                for (int j = i; j < nums.length; j++) {
                    sum += nums[j];
                    result.add(nums[j]);
                    if (sum >= target) {
                        len.add(result.size());
                        break;
                    }
                }
            }
            if (len.isEmpty()){
                return 0;
            }
            else{
                Collections.sort(len);
                return len.get(0);
            }
        }

}

