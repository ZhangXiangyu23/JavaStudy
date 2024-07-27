package practice.huifeng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:test1
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/16 11:04
 */
public class test1
{
    public static long unlockingKey(long key)
    {
        long  answer = 0;
        // Write your code here
        String keyStr = Long.toString(key);

        //转成字符数组
        char[] a = keyStr.toCharArray();

        //直接字符排序
        Arrays.sort(a);
        if (a[0] == '0'){
            for (int i = 1; i < a.length; i++) {
                if (a[i] != '0'){
                    char temp = a[0];
                    a[0] = a[i];
                    a[i] = temp;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char d : a) {
            sb.append(d);

        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // input for key
        long key = in.nextInt();


        long result = unlockingKey(key);
        System.out.print(result);

    }
}

