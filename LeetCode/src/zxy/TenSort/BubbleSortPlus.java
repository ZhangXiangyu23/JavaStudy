package zxy.TenSort;

/**
 * ClassName:BubbleSort
 * Description:
 *
 * @Author ������
 * @Create 2024/6/18 15:19
 */
public class BubbleSortPlus {
    public static void main(String[] args) {
        //����������
        int[] a = {5, 12, 18, -1, 0, 7};
        System.out.println("����֮ǰ");
        //����֮ǰ
        for (int element : a) {
            System.out.print(element + " ");
        }

        //����ð������
        //��һ��forѭ������ð�ݵ�����
        for (int i = 0; i < a.length-1; i++) {
            //����һ����־
            //֤���������
            boolean flag = true;
            //�ڶ���forѭ������ÿ�����򣬴�����Ԫ�ظ���
            //ÿ����һ�ˣ�������Ԫ�ؾͼ���һ��

            for (int j = 0; j < a.length - 1 - i; j++) {
                //����Ԫ�ؽ��бȽ�
                if (a[j] > a[j+1]){
                    //�����˽����׶Σ�֤��Ŀǰ���������
                    flag = false;
                    //����
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

            //���������ˣ������־����true��֤������û�н����������Ѿ������ˣ�������������
            if (flag){break;}

        }

        System.out.println();
        //����֮��
        System.out.println("����֮��");
        for (int element: a) {
            System.out.print(element + " ");
        }




    }

}
