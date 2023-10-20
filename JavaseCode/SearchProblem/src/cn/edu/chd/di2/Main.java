package cn.edu.chd.di2;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/18 20:14
 */




public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3, 7, 1};
        int[] nums2 = {4, 3, 1, 4};
        int k = 3;
        int moves = solution.minMoves(nums1, nums2, k);
        System.out.println("最少操作数量：" + moves);
    }
}
