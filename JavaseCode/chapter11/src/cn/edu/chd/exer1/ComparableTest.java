package cn.edu.chd.exer1;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName:ComparableTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/12 15:17
 */
public class ComparableTest {
    @Test
    public void test1(){
        //测试String已经写好的
        String [] a = new String[]{"Jack", "Tom", "Lucy"};

        //排序之前
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }

        System.out.println();
        //使用Arrays进行排序
        Arrays.sort(a);

        //排序之后进行展示
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }



    //对不同对象的大小进行排序
    @Test
    public void test2(){

        //商品数组
        Product[] products = new Product[5];
        //全参构造器，在new对象时就对属性进行赋值
        products[0] = new Product("Huawei", 5999);
        products[1] = new Product("XiaoMi", 4999);
        products[2] = new Product("iPhone", 9999);
        products[3] = new Product("vivo", 3999);
        products[4] = new Product("Honer", 5999);


        System.out.println("排序之前");
        //排序之前的遍历
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        System.out.println("----------------------------------------------");
        //使用arrays进行排序
        Arrays.sort(products);

        System.out.println("排序之后");
        //排序后的遍历
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        
    }

    //调用重写之后的compareTo方法
    @Test
    public void test3(){
        Product p1 = new Product("Huawei", 5999);
        Product p2 = new Product("iPhone", 9999);
        int v = p1.compareTo(p2);
        System.out.println(v);//负数
        
    }


}
