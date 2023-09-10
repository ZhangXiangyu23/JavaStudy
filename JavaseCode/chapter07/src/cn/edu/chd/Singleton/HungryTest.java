package cn.edu.chd.Singleton;

/**
 * ClassName:HungryTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/26 11:11
 */
public class HungryTest {
}

class HungrySingleton{
    private HungrySingleton(){

    }

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
