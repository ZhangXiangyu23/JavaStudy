package com.zxy;

/**
 * ClassName:Hot_001
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/14 20:49
 */
public class Hot_001 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] result = twoSum(nums, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int [] res= new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(j == i){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return res;


    }
}
