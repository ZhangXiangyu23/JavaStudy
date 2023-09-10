package cn.edu.chd.Keymap;

/**
 * ClassName:KeymapTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/23 21:20
 */
public class KeymapTest {
    public static void main(String[] args) {
        final int age = 10;
        System.out.println("hello");
        System.out.println("hello");
        String str = new String();
        String s = new String("zxy");
        System.out.println(s);


    }
}

abstract class Person {
    public abstract void method();
}

class man extends Person {
    @Override
    public void method() {

    }
}

interface Runable {
    void jump();
}

class Student implements Runable {
    @Override
    public void jump() {

    }
}
