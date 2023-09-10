package cn.edu.chd;

/**
 * ClassName:Main0828
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/28 15:53
 */
public class Main0828 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numWays(20));
    }

}


class Solution {
    public int numWays(int n) {
        int[] memory = new int[101];
        memory[0] = 1;
        memory[1] = 1;
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 1;
        } else{
            memory[n] = numWays(n-1) + numWays(n-2);
            return memory[n] % 1000000007;
        }

    }
}
