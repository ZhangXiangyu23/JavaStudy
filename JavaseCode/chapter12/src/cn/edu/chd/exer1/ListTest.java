package cn.edu.chd.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * ClassName:ListTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/10 10:01
 */
public class ListTest {
    @Test
    public void test1(){
        Collection StudentList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入学生信息");
        while (true){
            System.out.println("1:继续录入，0:结束录入");
            int num = scanner.nextInt();
            if (num == 1){
                Student student = new Student();
                //将输入姓名set到student对象中
                System.out.print("请输入学生姓名:");
                student.setName(scanner.next());
                //将输入年龄set到student对象中
                System.out.print("请输入学生年龄:");
                student.setAge(scanner.nextInt());
                //将student对象添加到ArrayList中
                StudentList.add(student);

            } else if (num == 0) {
                break;
            }


        }

        System.out.println("遍历学生信息:");
        //使用foreach进行遍历集合
//        for (Object stu: StudentList) {
//            System.out.println((Student)stu);
//        }

        //使用迭代器进行遍历
        //迭代谁，就是调用谁的迭代器方法
        Iterator iterator = StudentList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //关闭流，防止内存泄漏
        scanner.close();

    }

}
