package advance.threesixzero;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/7/20 15:51
 */
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        System.out.println(minimumCombinations(values));
    }

    public static int minimumCombinations(int[] values) {
        Arrays.sort(values);
        int combinations = 0;
        int target = 1;
        for (int value : values) {
            if (value > target) {
                combinations++;
                target += value;
            }
        }
        return combinations;
    }
}

