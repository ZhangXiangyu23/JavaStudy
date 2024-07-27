package practice.Sort;

/**
 * ClassName:SelectSort
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/21 17:25
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {5, -12, 10, 0, 8};


        //排序之前
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //排序
        fun(a);

        System.out.println();
        //排序之后
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }

    public static void fun(int[] a){
        //选定的元素
        for (int i = 0; i < a.length-1; i++) {
            //每次选出本趟最小的那个元素
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
}
