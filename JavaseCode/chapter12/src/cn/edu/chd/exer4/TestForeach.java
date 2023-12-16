package cn.edu.chd.exer4;

import org.junit.Test;

import java.util.ArrayList;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/19 10:46
 */
public class TestForeach{
    @Test
    public static void test1(String[] args) {
        //增强for循环的练习
        ArrayList<Integer> arrayList = new ArrayList<>();
        //基本数据类型进行装箱
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(1);

        //使用增强for循环进行遍历
        for (Integer i: arrayList) {
            System.out.println(i);
        }

    }

    @Test
    public static void test2(String[] args) {
        String[] str = new String[5];
        for (String myStr : str) {
            myStr = "atguigu";
            System.out.println(myStr);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

}


