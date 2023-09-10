package cn.edu.chd.JunitTest;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName:test
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/23 15:17
 */
public class test {
    @Test
    public void test1(){
        System.out.println("hello");
    }

    @Test
    public void test2(){
        System.out.println("world");
    }

    @Test
    public void test3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年龄");
        int age = scanner.nextInt();
        System.out.println(age);
    }

    @Test
    public void test4(){
        System.out.println("hahaha");
    }
}
