package zxy.TenSort;

/**
 * ClassName:BubbleSort
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/6/18 15:19
 */
public class BubbleSortPlus {
    public static void main(String[] args) {
        //待排序数组
        int[] a = {5, 12, 18, -1, 0, 7};
        System.out.println("排序之前");
        //排序之前
        for (int element : a) {
            System.out.print(element + " ");
        }

        //进行冒泡排序
        //第一层for循环代表冒泡的趟数
        for (int i = 0; i < a.length-1; i++) {
            //设置一个标志
            //证明是有序的
            boolean flag = true;
            //第二层for循环代表每趟排序，待排序元素个数
            //每跑完一趟，待排序元素就减少一个

            for (int j = 0; j < a.length - 1 - i; j++) {
                //两个元素进行比较
                if (a[j] > a[j+1]){
                    //进入了交换阶段，证明目前还是无序的
                    flag = false;
                    //交换
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

            //本趟跑完了，结果标志还是true，证明本趟没有交换，现在已经有序了，无需再排序了
            if (flag){break;}

        }

        System.out.println();
        //排序之后
        System.out.println("排序之后");
        for (int element: a) {
            System.out.print(element + " ");
        }




    }

}
