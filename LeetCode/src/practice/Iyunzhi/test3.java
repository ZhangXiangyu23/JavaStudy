package practice.Iyunzhi;

import java.util.Scanner;

/**
 * ClassName:test3
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/4/18 14:54
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        System.out.println(fun(input));

    }

    public static int fun(String s){
        int count = 0;
        int left = 0;
        int right = 0;
        boolean hasR = false;
        boolean hasE = false;
        while (right < s.length()){
            char currentChar = s.charAt(right);
            if (currentChar == 'r'){
                hasR = true;
            }
            else if (currentChar == 'e'){
                hasE = true;
            }
            else if (currentChar == 'd'){
                if (hasR && hasE)
                {
                    count++;
                }
                hasR = false;
                hasE = false;
                left = right + 1;
            }
            if ((right > 0 ? s.charAt(right - 1) != 'd' : true) && hasR && hasE){
                count++;
                while (left < right && (s.charAt(left) != 'r' && s.charAt(left) != 'e'))
                {
                    left++;
                }
                if (left < right)
                {
                    currentChar = s.charAt(left);
                    if (currentChar == 'r')
                    {
                        hasR = true;
                    }else if (currentChar == 'e')
                    {
                        hasE = true;
                    }
                }
            }
            right++;

        }
        if (right > 0 && hasR && hasE && (right == s.length() || s.charAt(right-1) != 'd')){
            count++;
        }
        return count;


    }


}
