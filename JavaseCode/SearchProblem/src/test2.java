/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/3 19:45
 */
import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 士兵数量
        int[] sizes = new int[n]; // 士兵大小数组

        for (int i = 0; i < n; i++) {
            sizes[i] = scanner.nextInt();
        }

        // 对士兵大小进行排序
        Arrays.sort(sizes);

        int minAddition = 0; // 记录最少需要添加的橡皮泥单位

        for (int i = 1; i < n; i++) {
            // 如果当前士兵大小和前一个士兵相同或小于前一个士兵，则需要添加橡皮泥
            if (sizes[i] <= sizes[i - 1]) {
                int diff = sizes[i - 1] - sizes[i] + 1;
                sizes[i] += diff;
                minAddition += diff;
            }
        }

        System.out.println(minAddition);
    }
}



