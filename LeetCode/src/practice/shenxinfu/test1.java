package practice.shenxinfu;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/6/11 19:36
 */
public class test1 {
    public static void main(String[] args) {
        //先判断是否为回文串
        System.out.println(panduan("aab"));

    }

    public static int panduan(String string){
        int n = string.length();
        if (n == 0){
            return 0;
        }
        boolean[][] isPal = new  boolean[n][n];
        int[] minCuts = new int[n];

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = 0; j <= i; j++) {
                if (string.charAt(i) == string.charAt(j) && (i-j <= 1 || isPal[j+1][i-1])){
                    isPal[j][i] = true;
                    min = j == 0 ? 0 :Math.min(min, minCuts[j-1] + 1);
                }

            }
            minCuts[i] = min;

        }

        return minCuts[n-1];

    }
}
