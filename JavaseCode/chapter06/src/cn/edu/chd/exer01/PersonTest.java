package cn.edu.chd.exer01;

/**
 * ClassName:PersonTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/16 10:21
 */
public class PersonTest {
    public static void main(String[] args) {
        //进行实例化
        Person p = new Person();
        //报错了：java: age 在 cn.edu.chd.exer01.Person 中是 private 访问控制
//        p.age = 10;
        p.setAge(50);
        System.out.println(p.getAge());
    }

}
