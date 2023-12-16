package zxy.StackAndQueue04;

import java.util.Stack;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/14 16:56
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("abbaca"));
    }
}



class Solution {
    public String removeDuplicates(String s) {
        //字符串转字符数组
        char[] a = s.toCharArray();
        //使用栈来解决
        Stack<Character> result = new Stack();
        //扫描字符数组
        for(int i = 0;i<a.length;i++){
            if(result.empty() || result.peek() != a[i]){
                result.push(a[i]);
            }
            else if(result.peek() == a[i]){
                result.pop();
            }
        }
        //逆序输出栈内元素
        String r = "";
        int i = 0;
        int l = result.size();
        while(i < l){
            r += result.pop();
            i++;
        }
        StringBuilder sb = new StringBuilder(r);
        return sb.reverse().toString();


    }
}
