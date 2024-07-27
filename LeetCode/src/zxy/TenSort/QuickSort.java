package zxy.TenSort;

/**
 * ClassName:QuickSort
 * Description:
 *
 * @Author ������
 * @Create 2024/7/27 17:51
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 0, 7, -7, 666, 0, 19, 4};
        System.out.println("����֮ǰ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        //������
        sort(arr, 0, arr.length-1);
        System.out.println();
        System.out.println("����֮��");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }




    }

    //��������
    public static void sort(int[] arr, int left, int right){
        //�ݹ����
        if (left >= right){
            return;
        }

        //��ָ��
        int l = left;
        //��ָ��
        int r = right;
        while (l < r){
            //��ָ����ǰ�ƶ�
            while (l < r && arr[r] >= arr[left]) r--;
            //��ָ������ƶ�
            while (l < r && arr[l] <= arr[left]) l++;

            //����ָ��ָ��ͬһ��Ԫ����
            if(l == r){
                int temp = arr[left];
                arr[left] = arr[l];
                arr[l] = temp;
            }else {
                //�������ֻ���ǣ�l����С��r��
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }


        //���沽��һ������ˡ���׼Ԫ�ع�λ"
        //���ݹ�
        sort(arr, left, l-1);
        //�Ҳ�ݹ�
        sort(arr, l+1, right);
    }

}
