package LanQiao;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName:test4
 * Description:
 *
 * @Author ������
 * @Create 2024/4/12 21:17
 */
public class test4 {
    public static void main(String[] args) {
        //���ַ���ת��Ϊ�ַ����鴦��
        String str = "abcd";
        //��������ַ����в��
        char[] a = a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("------------------------");
        //ȡ�ַ�����ָ��λ�õ��ַ�
        System.out.println(str.charAt(0));
        System.out.println("------------------------");

        //ʹ��stringbuilder
        StringBuilder s = new StringBuilder("zxy");
        System.out.println(s.append("nb"));

        System.out.println("------------------------");
        //����һ��10���ڵ������
        int x = new Random().nextInt(10);
        System.out.println(x);

        System.out.println("------------------------");

        //���м�ֵ
        int low = 0;
        int high = 5;
        System.out.println(low + ((high - low)>>1));

        //��������ת��Ϊ�ַ�������
        System.out.println("------------------------");
        System.out.println(String.valueOf(123) instanceof  String);

        //���ַ�������ȡ����
        System.out.println("------------------------");
        System.out.println(Integer.parseInt("123") + 100);

        System.out.println("------------------------");
        //�������
        Scanner scanner = new Scanner(System.in);
        System.out.println("������һ������");
        int y = scanner.nextInt();
        System.out.println(y);

        //���Խ��տո�ͻس�����
        String m = scanner.next();
        System.out.println(m);

//        System.out.println("********************");
        //���ԳԻس���
        String l = scanner.nextLine();
        System.out.println(l);


    }
}

