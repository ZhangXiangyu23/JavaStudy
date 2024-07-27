package practice.YunZhi;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/11 20:54
 */
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 输入n, m, k
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(maxApples(n, m, k));
    }

    private static int maxApples(int n, int m, int k) {
        // 每个孩子至少分配到一个苹果，剩余苹果数
        int remainingApples = m - n;

        // 如果剩余苹果为0，小明分到的苹果数即为1
        if (remainingApples == 0) return 1;

        // 计算平均每个孩子可以额外分到的苹果数
        int averageExtra = remainingApples / n;
        // 计算分配苹果后剩余的苹果数
        int extraRemaining = remainingApples % n;

        // 小明分到的苹果数为基础的1个加上平均分配的苹果数
        int kApples = 1 + averageExtra;

        // 如果小明的编号在剩余苹果能分配的范围内，则小明可以额外多分到一个苹果
        if (k <= extraRemaining) kApples++;

        return kApples;
    }
}
