package zxy.BinaryTree16;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/12/16 11:14
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //中序数组
        int[] inorder = {2,3,1};
        //后序数组
        int[] postorder = {3,2,1};

        System.out.println(solution.buildTree(inorder, postorder));


    }
}


class Solution {
    //递归三部曲：
    //第一步：确定递归函数的返回值和参数列表
    //返回值为：构造出来的二叉树的根节点
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        //根据二叉树的中序遍历和后序遍历确定一棵二叉树
        //第二步：确定递归终止条件
        //没有根
        if(postorder.length == 0){
            return null;
        }
        //找到这棵树的根节点值
        int value = postorder[postorder.length-1];
        TreeNode root = new TreeNode(value);
        //剪枝，二叉树只有一个根节点的情况
        if(postorder.length == 1){
            return root;
        }

        //递归三部曲的第三步：单层递归逻辑
        //切割中序数组
        int i = 0;
        for(;i<inorder.length;i++){
            if(inorder[i] == value){
                break;
            }
        }

        //左侧中序数组
        int[] leftinorder = new int[i];
        for(int j = 0;j<leftinorder.length;j++){
            leftinorder[j] = inorder[j];
        }


        //左侧后续数组
        int[] leftpostorder = new int[i];
        for(int j = 0;j<leftpostorder.length;j++){
            leftpostorder[j] = postorder[j];
        }

        //左侧递归遍历
        root.left = buildTree(leftinorder, leftpostorder);

        //右侧中序数组
        int[] rightinorder = new int[inorder.length-i-1];
        int count = 0;
        for(int m = i+1; m<inorder.length; m++){
            rightinorder[count] = inorder[m];
            count++;
        }

        //右侧后序数组
        int[] rightpostorder = new int[inorder.length-i-1];
        int n = 0;
        for(int j=i;j<postorder.length-1;j++){
            rightpostorder[n] = postorder[j];
            n++;
        }

        //右侧递归遍历
        root.right = buildTree(rightinorder, rightpostorder);

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
