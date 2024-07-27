package practice.huifeng;

import java.util.Scanner;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/16 11:34
 */
public class test2
{
    public static int[]  sortedProductID(int[][] tag, int K)
    {
        int[]  answer = new int[100];
        // Write your code here


        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // input for tag
        int tag_row = in.nextInt();
        int tag_col = in.nextInt();
        int tag[][] = new int[tag_row][tag_col];
        for(int idx = 0; idx < tag_row; idx++)
        {
            for(int jdx = 0; jdx < tag_col; jdx++)
            {
                tag[idx][jdx] = in.nextInt();
            }
        }
        // input for K
        int K = in.nextInt();


        int[] result = sortedProductID(tag, K);
        for(int idx = 0; idx < result.length - 1; idx++)
        {
            System.out.print(result[idx] + " ");
        }
        System.out.print(result[result.length - 1]);
    }
}
