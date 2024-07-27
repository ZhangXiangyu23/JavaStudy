package advance.threesixzero;

/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/7/20 15:54
 */
import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input values
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        System.out.println(maxRiskPeople(n, k, x, y));
    }

    public static int maxRiskPeople(int n, int k, int[] x, int[] y) {
        boolean[] isRisk = new boolean[n];
        int maxRiskCount = 0;

        for (int i = 0; i < n; i++) {
            if (!isRisk[i]) {
                int riskCount = spreadRisk(i, k, x, y, isRisk);
                maxRiskCount = Math.max(maxRiskCount, riskCount);
            }
        }

        return maxRiskCount;
    }

    public static int spreadRisk(int startIndex, int k, int[] x, int[] y, boolean[] isRisk) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startIndex);
        isRisk[startIndex] = true;
        int riskCount = 1;

        while (!queue.isEmpty()) {
            int currentIndex = queue.poll();

            for (int i = 0; i < x.length; i++) {
                if (!isRisk[i] && (Math.abs(x[currentIndex] - x[i]) + Math.abs(y[currentIndex] - y[i]) <= k)) {
                    isRisk[i] = true;
                    queue.add(i);
                    riskCount++;
                }
            }
        }

        return riskCount;
    }
}

