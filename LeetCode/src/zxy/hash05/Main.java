package zxy.hash05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/28 22:04
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res = solution.threeSum(nums);
        System.out.println(res);
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //创建一个结果集合
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //对数组进行排序
        Arrays.sort(nums);
        //使用i指针遍历第一个元素a
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                return res;
            }
            //对第一个数a进行去重
            if(i > 0 && nums[i-1]==nums[i]){
                //证明之前的集合，在a的这个数值上收集过这个数了
                continue;
            }
            //使用left指针和right指针遍历
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(nums[i]+nums[left]+nums[right] < 0){
                    left++;
                }else if(nums[i]+nums[left]+nums[right] > 0){
                    right--;
                }else{
                    //一维结果
                    List<Integer> result = new LinkedList<Integer>();
                    result.add(nums[i]);
                    result.add(nums[left]);
                    result.add(nums[right]);
                    res.add(result);

                    //去重
                    while (left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }


            }
        }
        return res;

    }
}