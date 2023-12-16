package zxy.StackAndQueue06;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/17 20:58
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-7,-8,7,5,7,1,6,0};
        int k = 4;
        int[] result = new int[nums.length-k+1];
        result = solution.maxSlidingWindow(nums, k);
        //快速遍历数组
        System.out.println(Arrays.toString(result));

    }
}


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //定义一个单调递减队列
        LinkedList<Integer> queue = new LinkedList();
        //结果数组
        int[] result = new int[nums.length-k+1];
        //将前k个进行push
        for(int i=0;i < k;i++){
            push(queue, nums[i]);
        }
        int count = 0;
        result[count++] = getMaxValue(queue);
        for(int i=k;i<nums.length;i++){
            //先揣
            pop(queue, nums[i-k]);
            //再加
            push(queue, nums[i]);
            result[count++] = getMaxValue(queue);
        }
        //返回结果
        return result;

    }

    //使用单调递减队列
    //pop操作
    public void pop(LinkedList<Integer> queue, int val){
        if((queue.size() != 0) && (val == queue.get(0))){
            queue.remove(0);
        }
    }


    //push操作
    public void push(LinkedList<Integer> queue, int val){
        while(!queue.isEmpty() && val > queue.getLast()){
            queue.removeLast();
        }
        //入队
        queue.add(val);
    }

    //getMaxValue
    public int getMaxValue(LinkedList<Integer> queue){
        return (int)queue.get(0);

    }
}
