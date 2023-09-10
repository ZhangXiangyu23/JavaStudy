package cn.edu.chd;

/**
 * ClassName:LazyTonTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/8 17:23
 */
public class LazyTonTest {
    public static void main(String[] args) {
        System.out.println(LazyTon.getLazyTon());
    }
}


class LazyTon{
    //私有化构造器
    private LazyTon(){

    }

    //静态实例变量，因为需要用下面的静态方法进行调用
    private static LazyTon lazyTon = null;


    //获取实例变量
    public static LazyTon getLazyTon() {
        if(lazyTon == null){
            lazyTon = new LazyTon();
        }
        return lazyTon;
    }
}
