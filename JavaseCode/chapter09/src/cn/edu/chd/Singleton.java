package cn.edu.chd;

/**
 * ClassName:singleton
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/7 15:06
 */
public class Singleton {
    public static void main(String[] args) {
        System.out.println(Person.getInstance());

    }
}


/**
 * 饿汉式
 */
//class Person{
//    //1.使用私有的无参构造器
//    private Person(){
//
//    }
//
//    //2.创建static的实例变量
//    private static Person instance = new Person();
//
//    //3.通过静态方法进行返回单例
//    public static Person getInstance(){
//        return instance;
//    }
//}


/**
 * 懒汉式
 */
class Person{
    //1.私有化的空参构造器
    private Person(){

    }

    //2.私有化的实例变量
    private static Person instance;


    //3.返回对象

    public synchronized static  Person getInstance(){
        if(instance == null){
            instance = new Person();
        }
        return instance;
    }
}

