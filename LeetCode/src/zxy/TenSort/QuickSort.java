package zxy.TenSort;

/**
 * ClassName:QuickSort
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/7/27 17:51
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 0, 7, -7, 666, 0, 19, 4};
        System.out.println("排序之前");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        //调函数
        sort(arr, 0, arr.length-1);
        System.out.println();
        System.out.println("排序之后");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }




    }

    //快速排序
    public static void sort(int[] arr, int left, int right){
        //递归出口
        if (left >= right){
            return;
        }

        //左指针
        int l = left;
        //右指针
        int r = right;
        while (l < r){
            //右指针向前移动
            while (l < r && arr[r] >= arr[left]) r--;
            //左指针向后移动
            while (l < r && arr[l] <= arr[left]) l++;

            //左右指针指向同一个元素了
            if(l == r){
                int temp = arr[left];
                arr[left] = arr[l];
                arr[l] = temp;
            }else {
                //此种情况只能是：l还是小于r的
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }


        //上面步骤一定完成了“基准元素归位"
        //左侧递归
        sort(arr, left, l-1);
        //右侧递归
        sort(arr, l+1, right);
    }

}
