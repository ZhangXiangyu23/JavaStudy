package zxy.BinaryTree17;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/12/16 21:59
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        Solution solution = new Solution();
        solution.constructMaximumBinaryTree(nums);

    }
}


class Solution {
    //递归三部曲：
    //第一步：确定递归函数的返回值和参数列表
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        //第二步：确定递归终止条件
        if(nums.length == 1){
            TreeNode node = new TreeNode(nums[0]);
            return node;
        }


        //寻找nums中的最大值
        int MaxValue = -1;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > MaxValue){
                MaxValue = nums[i];
                index = i;
            }
        }

        //中
        TreeNode root = new TreeNode(MaxValue);
        //划分数组
        //为了能够递归结束，所以这里的数组长度最小也得为1
        if(index > 0){
            int[] newNums = new int[index-0];
            for(int i = 0; i<newNums.length;i++){
                newNums[i] = nums[i];
            }
            //左侧递归
            root.left = constructMaximumBinaryTree(newNums);

        }

        if(index < nums.length-1){
            int [] newNums = new int[nums.length-index-1];
            int count = 0;
            for(int i=index+1;i<nums.length;i++){
                newNums[count] = nums[i];
                count++;
            }
            //右侧递归
            root.right = constructMaximumBinaryTree(newNums);
        }

        //返回
        return root;



    }
}




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
