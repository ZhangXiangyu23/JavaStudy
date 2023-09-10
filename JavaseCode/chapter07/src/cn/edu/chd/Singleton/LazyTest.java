package cn.edu.chd.Singleton;

/**
 * ClassName:LazyTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/26 11:13
 */
public class LazyTest {
}


class LazySingleton{
    private LazySingleton(){

    }

    private static LazySingleton lazySingleton;

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}