package cn.edu.chd;

/**
 * ClassName:ThreadTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/2 9:53
 */

/**
 * 创建线程的第一种方式:继承Thread类
 */

public class ThreadTest {
    public static void main(String[] args) {
        //new子线程1
        subClass1 even = new subClass1();
        //启动子线程1
        even.start();

        //new子线程2
        subClass2 odd = new subClass2();
        //启动子线程2
        odd.start();

    }


}

// ①继承Thread类
class subClass1 extends Thread{
    //②重写run方法


    @Override
    public void run() {
        super.run();
        //该子线程要做的事情
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }
    }
}

// ①继承Thread类
class subClass2 extends Thread{
    //②重写run方法

    @Override
    public void run() {
        super.run();
        //该子线程要做的事情
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 1){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }
    }
}
