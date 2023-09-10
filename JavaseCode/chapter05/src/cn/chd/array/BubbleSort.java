package cn.chd.array;

/**
 * ClassName:BubbleSort
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/7 11:05
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 1, 12, 33, 55, 2, 0};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");

        }
//        Arrays.sort(a);
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + "\t");
//
//        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

    }
}
