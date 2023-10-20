package zxy.array01;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/15 22:29
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(solution.search(nums, target));
    }

}


/**
 * 区间是左闭右闭的写法
 */
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int middle = (left+right)/2;
            if(target < nums[middle]){
                right = middle - 1;
            }
            else if(target > nums[middle]){
                left = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;

    }
}
