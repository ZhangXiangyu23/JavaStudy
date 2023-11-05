package zxy.string04;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/5 20:37
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatedSubstringPattern("babbabbabbabbab"));
    }

}

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String ss = s+s;
        char[] a = ss.toCharArray();
        //重新构造字符串
        String newS = "";
        for(int i=1;i<a.length-1;i++){
            newS += a[i];
        }
        if(newS.contains(s)){
            return true;
        }else{
            return false;
        }

    }



}
