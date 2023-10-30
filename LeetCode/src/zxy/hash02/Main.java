package zxy.hash02;

import java.util.HashSet;
import java.util.Iterator;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/26 16:25
 */
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Solution solution = new Solution();
        //结果
        int[] result = solution.intersection(nums1, nums2);
        //增强for
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //使用数组当哈希表
        int[] hash = new int[1001];
        //扫描第一个数组
        for(int i=0; i < nums1.length; i++){
            //在第一个数组中只要出现了这个数字，就hash数组中标记1
            hash[nums1[i]] = 1;
        }
        //使用set存储结果
        HashSet <Integer> res = new HashSet<>();
        //扫描第二个数组
        for(int j=0;j < nums2.length; j++){
            if(hash[nums2[j]] == 1){
                res.add(nums2[j]);
            }
        }
        //创建结果数组
        int[] result = new int[res.size()];
        int index = 0;
        //将set转为数组
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()){
            result[index] = iterator.next();
            index++;
        }

        return result;


    }
}
