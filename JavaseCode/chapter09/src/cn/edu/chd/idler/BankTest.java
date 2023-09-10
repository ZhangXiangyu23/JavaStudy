package cn.edu.chd.idler;

/**
 * ClassName:BankTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/3 14:57
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;
    public static void main(String[] args) {
        //单例模式中的懒汉式，存在线程安全的问题
        //例如
        Thread t1 = new Thread(){
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        //启动线程
        t1.start();
        t2.start();

        //阻塞一下t1、t2两个分线程，等t1、t2执行完成之后，再执行主线程
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);

    }

}

//单例模式之懒汉式
class Bank{
    private static Bank instance = null;

    public static synchronized Bank getInstance(){
        if(instance == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            instance = new Bank();
        }
        return instance;
    }

}

