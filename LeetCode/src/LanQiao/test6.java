package LanQiao;

/**
 * ClassName:test6
 * Description:
 *
 * @Author ������
 * @Create 2024/4/12 22:25
 */
public class test6 {
    public static void main(String[] args) {
        int a = 2000;
        if(((a % 4 == 0) && (a % 100 != 0)) || a % 400 == 0){
            System.out.println(a + "������");
        }else {
            System.out.println(a + "��������");
        }
    }
}
