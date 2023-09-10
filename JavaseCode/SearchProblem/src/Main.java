/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/3 19:54
 */
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] flavors = new int[n];
        for (int i = 0; i < n; i++) {
            flavors[i] = scanner.nextInt();
        }

        int maxLength = 0;
        HashSet<Integer> visited = new HashSet<>();
        int left = 0, right = 0;
        while (right < n) {
            if (!visited.contains(flavors[right])) {
                visited.add(flavors[right]);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                visited.remove(flavors[left]);
                left++;
            }
        }

        System.out.println(maxLength);
    }
}
