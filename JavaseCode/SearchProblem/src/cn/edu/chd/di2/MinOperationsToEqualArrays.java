package cn.edu.chd.di2;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/18 19:56
 */
import java.util.Arrays;

public class test3 {
    public int minOperations(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[] diff = new int[n];

        // 计算差值数组
        for (int i = 0; i < n; i++) {
            diff[i] = nums1[i] - nums2[i];
        }

        // 对差值数组进行排序
        Arrays.sort(diff);

        int operations = 0;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            // 找到最大的差值
            while (i <= j && diff[j] <= 0) {
                j--;
            }

            // 如果没有正差值可用，返回-1
            if (j < i) {
                return -1;
            }

            // 找到最小的差值
            while (i <= j && diff[i] >= 0) {
                i++;
            }

            // 执行操作
            if (i <= j) {
                int minDiff = Math.min(Math.abs(diff[i]), Math.abs(diff[j]));
                diff[i] += minDiff;
                diff[j] -= minDiff;
                operations++;
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        MinOperationsToEqualArrays solution = new MinOperationsToEqualArrays();
        int[] nums1 = {1, 3, 7, 1};
        int[] nums2 = {4, 3, 1, 4};
        int k = 3;
        int result = solution.minOperations(nums1, nums2, k);
        System.out.println("Minimum operations required: " + result);
    }
}
