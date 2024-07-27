package practice.smallRedBook;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/26 19:53
 */
import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        List<Integer> a = new ArrayList<>();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            a.add(num);
            sum += num;
        }

        List<Integer> b = new ArrayList<>(a);
        b.sort(Collections.reverseOrder());
        long s = n * b.get(0) - sum;

        for (int i = 0; i < n; i++) {
            if (a.get(i).equals(b.get(0))) {
                System.out.println(sum);
                continue;
            }
            if (n == 2) {
                System.out.println("-1");
                continue;
            }

            a.set(i, a.get(i) + 1);
            long diff = b.get(0) - a.get(i), cur = s - (b.get(0) - a.get(i) + 1), ans = sum + 1;

            if (diff <= cur) {
                ans += 2 * diff;
                System.out.println(ans);
            } else {
                ans += 2 * cur;
                a.set(i, a.get(i) + (int)cur);

                long l = 1, r = (long)1e9;
                while (l <= r) {
                    long mid = (l + r) / 2;
                    long t = mid / (n - 1);
                    if (mid % (n - 1) != 0) t += 1;
                    if (a.get(i) + mid < t + b.get(0)) l = mid + 1;
                    else r = mid - 1;
                }
                ans += 2 * l;
                System.out.println(ans);
            }
        }
        scanner.close();
    }
}

