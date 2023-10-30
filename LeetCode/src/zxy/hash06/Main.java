package zxy.hash06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/30 21:03
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Solution solution = new Solution();
        res = solution.fourSum(nums, -294967296);
        System.out.println(res);
    }
}


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //双指针的思路
        //最终结果的二维集合
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //先进行排序
        Arrays.sort(nums);
        //确定第一个元素
        for(int k=0;k<nums.length;k++){
            //进行一级剪枝
            if(nums[k]>0 && target>0 && nums[k]>target){
                break;
            }
            //进行一级去重
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
            //确定第二个元素
            for(int i=k+1;i<nums.length;i++){
                //进行二级剪枝
                long twonum = nums[k]+nums[i];
                if(twonum>0 && target>0 && twonum>target){
                    break;
                }
                //进行二级去重
                if(i>k+1&&nums[i]==nums[i-1]){
                    continue;
                }
                //双指针
                int left = i+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = (long)nums[k]+nums[i]+nums[left]+nums[right];
                    if(sum>target){
                        //往小放
                        right--;
                    }
                    else if(sum<target){
                        //往大放
                        left++;
                    }else{
                        res.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                        //left和right去重
                        while(left < right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left < right && nums[right]==nums[right-1]){
                            right--;
                        }
                        //指针移动
                        left++;
                        right--;

                    }
                }
            }
        }
        return res;

    }
}
