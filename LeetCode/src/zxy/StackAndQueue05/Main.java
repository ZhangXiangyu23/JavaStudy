package zxy.StackAndQueue05;

import java.util.Stack;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/14 21:12
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //字符串数组
        String[] a= new String[]{"4","13","5","/","+"};
        System.out.println(solution.evalRPN(a));

    }
}


class Solution {
    public int evalRPN(String[] tokens) {
        //使用栈进行操作
        Stack<String> result = new Stack();
        for(int i = 0; i < tokens.length;i++){
            //遇到符号了，将栈顶的两个元素进行弹出，然后运算
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                if(tokens[i].equals("+")){
                    int num1 = Integer.parseInt(result.pop());
                    int num2 = Integer.parseInt(result.pop());
                    //进行运算,然后将运算结果转为字符串，压栈
                    result.push(Integer.toString(num1 + num2));
                }else if(tokens[i].equals("-")){
                    int num1 = Integer.parseInt(result.pop());
                    int num2 = Integer.parseInt(result.pop());
                    //进行运算,将运算结果压栈
                    //后弹出栈的元素应该作为被减数
                    result.push(Integer.toString(num2 - num1));
                }else if(tokens[i].equals("*")){
                    int num1 = Integer.parseInt(result.pop());
                    int num2 = Integer.parseInt(result.pop());
                    //进行运算,将运算结果压栈
                    result.push(Integer.toString(num1 * num2));
                }else if(tokens[i].equals("/")){
                    int num1 = Integer.parseInt(result.pop());
                    int num2 = Integer.parseInt(result.pop());
                    //进行运算,将运算结果压栈
                    //后弹出栈的应该作为被除数
                    result.push(Integer.toString(num2 / num1));
                }
            }else{
                //遇到的是数字，然后进行压栈
                result.push(tokens[i]);
            }
        }
        //将最终的结果转为整数进行return
        return Integer.parseInt(result.pop());

    }
}
