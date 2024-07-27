package practice.smallRedBook;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/26 19:38
 */
import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<int[]> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            a.add(new int[] {i, x, y});
        }

        Collections.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] b, int[] c) {
                int s1 = b[1] + 2 * b[2];
                int s2 = c[1] + 2 * c[2];
                if (s1 == s2) {
                    if (b[2] == c[2]) {
                        return Integer.compare(b[0], c[0]);
                    }
                    return Integer.compare(c[2], b[2]);
                }
                return Integer.compare(s2, s1);
            }
        });

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(a.get(i)[0] + 1);
        }

        Collections.sort(ans);
        for (int e : ans) {
            System.out.print(e + " ");
        }

        scanner.close();
    }
}

