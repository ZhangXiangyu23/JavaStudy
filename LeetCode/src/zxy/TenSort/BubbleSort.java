package zxy.TenSort;

/**
 * ClassName:BubbleSort
 * Description:
 *
 * @Author ������
 * @Create 2024/7/27 18:21
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {520, 33, 66, -17, 0, 520, 25};
        System.out.println("����֮ǰ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("����֮��");
        //���ú���
        sort(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }


    }

    public static void sort(int[] arr){
        //ð������
        //����
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                //�ڱȽϵĹ����У���ǰ�ƶ�
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

    }
}
