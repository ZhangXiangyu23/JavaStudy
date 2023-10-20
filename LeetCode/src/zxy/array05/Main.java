package zxy.array05;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/10/20 10:33
 */
public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int n = 4;
        int a[][] = new int[n][n];
        a = solution.generateMatrix(n);
        //对结果数组进行遍历
        for (int i=0; i < n; i++){
            for (int j =0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public int[][] generateMatrix(int n) {
        //使用循环不变量的原则
        int[][] result = new int[n][n];
        //起始位置
        int startX = 0;
        int startY = 0;
        //计数
        int count = 1;
        //设定offset
        int offset = 1;


        //需要旋转几圈呢？
        int circle = 0;
        while(circle < n/2){
            //处理第一条边
            int i = startX;
            int j = startY;
            for(j =startY; j<n-offset; j++){
                result[startX][j] = count;
                count++;
            }
            //处理第二条边
            for(i =startX; i<n-offset; i++){
                result[i][j] = count;
                count++;
            }
            //处理第三条边
            for(j=n-offset; j>startY; j--){
                result[i][j] = count;
                count++;
            }
            //处理第四条边
            for(i=n-offset; i>startX; i--){
                result[i][j] = count;
                count++;
            }
            offset++;
            startX++;
            startY++;
            circle++;
        }
        if(n % 2 == 1){
            result[startX][startY] = count;
        }
        return result;

    }
}
