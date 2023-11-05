package zxy.string02;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/3 22:38
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcd";
        System.out.println(solution.reverseStr(s, 2));
    }
}


class Solution {
    public String reverseStr(String s, int k) {
        //字符转成字符数组
        char[] a = s.toCharArray();
        int i = 0;
        while(i<a.length){
            if(i+2*k <= a.length){
                reverse(a, i, i+k);
                i = i + 2*k;
                continue;
            }
            else if(i+k <= a.length){
                reverse(a, i, i+k);
                i = i +k;
                break;
            }
            else{
                reverse(a, i, a.length);
                break;
            }
        }
        String result = "";
        for(int m=0;m<a.length;m++){
            result += a[m];
        }
        return result;

    }

    public void reverse(char[] a, int start, int end){
        int i = start;
        int j = end-1;
        while(i<=j){
            //交换
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

    }
}
