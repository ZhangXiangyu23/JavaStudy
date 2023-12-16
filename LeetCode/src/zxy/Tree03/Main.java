package zxy.Tree03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/26 21:53
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode node1 = new TreeNode();
        node1.val = 1;
        TreeNode node2 = new TreeNode();
        node2.val = 2;
        TreeNode node3 = new TreeNode();
        node3.val = 3;

        //进行链接
        node1.left = null;
        node1.right = node2;

        node2.left = node3;
        node2.right = null;

        node3.left = null;
        node3.right = null;

        //定义结果集
        List<Integer> res = new ArrayList();
        res = s.inorderTraversal(node1);
        System.out.println(res);

    }
}


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //使用迭代法进行实现
        //可以使用指针+栈来实现

        //定义结果集
        List<Integer> res = new ArrayList();
        //定义栈
        Stack<TreeNode> a = new Stack();
        //定义指针
        TreeNode cur = root;
        //使用指针进行遍历这棵树root
        while((cur != null) || (!a.isEmpty())){
            if(cur != null){
                //然后压栈
                a.push(cur);
                //然后一路向左
                cur = cur.left;
            }else{
                //遇到null了，然后弹出元素，放入结果集合中
                TreeNode temp = a.pop();
                res.add(temp.val);
                //然后向右侧进行遍历
                cur = temp.right;
            }
        }
        //返回结果集合
        return res;

    }
}


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}