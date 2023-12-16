package zxy.Tree05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/12/1 9:33
 */
public class Main {
    public static void main(String[] args) {
        //测试一下
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9, null, null);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15, null, null);
        TreeNode node4 = new TreeNode(7, null, null);
        root.left = node1;
        root.right = node2;

        node2.left = node3;
        node2.right = node4;

        //调用层序遍历的代码
        Solution solution = new Solution();
        List<List<Integer>> res = new ArrayList();
        res = solution.levelOrder(root);
        //打印结果
        System.out.println(res);




    }
}



class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //层序遍历,也是图论里面的广搜
        //结果集合
        List<List<Integer>> res = new ArrayList();
        //整一个队列，用LinkedList模拟一个队列
        Queue<TreeNode> queue = new LinkedList();
        if(root != null){
            queue.offer(root);
        }
        while(queue.size() != 0){
            //获取这一层的元素个数
            int size = queue.size();
            //收集本层元素的一维集合
            List<Integer> a = new LinkedList();
            while(size > 0){
                //获取这一层的元素,并弹出队列
                TreeNode node = queue.poll();

                //放入一维结果集
                a.add(node.val);
                //将其左右孩子加入队列
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                size--;
            }
            //将放有本层元素的一维集合，放入二维结果集合中
            res.add(a);
        }

        //返回结果
        return res;
    }
}


class TreeNode{
    //树节点中的值
    int val;
    //树的左孩子
    TreeNode left;
    //树的右孩子
    TreeNode right;

    //无参构造
    public TreeNode(){}
    //单参构造
    public TreeNode(int val){
        this.val = val;
    }
    //全参构造
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}