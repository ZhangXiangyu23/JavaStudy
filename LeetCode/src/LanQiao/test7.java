package LanQiao;

import java.util.Scanner;

/**
 * ClassName:test7
 * Description:
 *
 * @Author ������
 * @Create 2024/4/12 22:37
 */
public class test7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //�����λ
        int b = a / 100;
        //����ʮλ
        int c = (a/10) % 10;
        //�����λ
        int d = a % 10;

        if ((b*b*b)+(c*c*c)+(d*d*d) == a){
            System.out.println("��ˮ�ɻ���");
        }else{
            System.out.println("����ˮ�ɻ���");
        }

    }

}
