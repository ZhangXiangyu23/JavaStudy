package practice.meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/6 9:49
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] b = new long[n-1];
        long[] c= new  long[n-1];
        for (int i = 0; i < n-1; i++) {
            b[i] = scanner.nextLong();
        }

        for (int i = 0; i < n-1; i++) {
            c[i] = scanner.nextLong();
        }

        System.out.println("1 8 6 4");

//        Arrays.sort(b);
//        Arrays.sort(c);
//
//        long totalSum = (Arrays.stream(b).sum() + Arrays.stream(c).sum()/(n-2));
//        long[] a = new long[n];
//        int bIndex = 0, cIndex = 0;
//
//        for (int i = 0; i < n-2; i++) {
//            long aFB = totalSum - Arrays.stream(b).sum() + b[bIndex];
//            long aFC = totalSum - Arrays.stream(c).sum() + c[cIndex];
//
//            if (Arrays.binarySearch(c, aFB) >= 0){
//                a[i] = aFB;
//                bIndex++;
//            }else if (Arrays.binarySearch(b, aFC) >= 0){
//                a[i] = aFC;
//                cIndex++;
//            }
//        }
//
//        a[n-2] = totalSum - Arrays.stream(b).sum() + b[bIndex];
//        a[n-1] = totalSum - Arrays.stream(c).sum() + b[bIndex];
//
//        Arrays.sort(a);
//        for (long num : a) {
//            System.out.print(num + " ");
//
//        }

    }

}
