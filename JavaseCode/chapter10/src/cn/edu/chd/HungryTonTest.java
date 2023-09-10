package cn.edu.chd;

import org.junit.Test;

/**
 * ClassName:HungryTonTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/8 17:18
 */
public class HungryTonTest {
    public static void main(String[] args) {
        System.out.println(HungryTon.getInstance());
    }


    @Test
    public void test(){
        System.out.println(123);
    }

}

//单例设计模型
//饿汉式
class HungryTon{
    //私有化构造器
    private HungryTon(){

    }

    //静态变量，new一个实例
    private static HungryTon instance = new HungryTon();

    //获取实例
    public static HungryTon getInstance(){
        return instance;
    }

}
