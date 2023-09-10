package cn.edu.chd;

/**
 * ClassName:RunableTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/2 11:27
 */


import org.junit.Test;

/**
 * 创建线程的第二种方式：实现Runable接口
 */
public class RunableTest {
    public static void main(String[] args) {
        //实现了runable接口的类
        Even even = new Even();
        //将其作为参数传入Thread构造器
        Thread thread1 = new Thread(even);
        //启动分线程
        thread1.start();

        Odd odd = new Odd();
        Thread thread2 = new Thread((odd));
        thread2.start();


    }
    
    @Test
    public void test1(){
        System.out.println("张翔宇");
        
    }

}


class Even implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}


class Odd implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}