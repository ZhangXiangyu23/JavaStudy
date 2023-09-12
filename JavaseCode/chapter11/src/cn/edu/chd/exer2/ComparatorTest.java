package cn.edu.chd.exer2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName:ComparatorTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/12 17:01
 */
public class ComparatorTest {
    @Test
    public void test1(){
        //new一个comparator接口的匿名实现类
        Comparator comparator = new Comparator() {
            //按照商品的价格从低到高排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2){
                    return 0;
                }
                if (o1 instanceof Product && o2 instanceof Product){
                    //强转
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;
                    return Double.compare(p1.getPrices(), p2.getPrices());

                }
                throw new RuntimeException("类型不匹配");

            }
        };

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
        //将comparator对象作为参数进行传入,排序
        Arrays.sort(products, comparator);

        System.out.println("排序之后");
        //排序后的遍历
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }



        
    }
    
    
    //按照名称进行排序
    @Test
    public void test2(){
        //new一个comparator接口的匿名实现类
        Comparator comparator = new Comparator() {
            //按照商品的名称进行排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2){
                    return 0;
                }
                if (o1 instanceof Product && o2 instanceof Product){
                    //强转
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;
                    return p1.getName().compareTo(p2.getName());

                }
                throw new RuntimeException("类型不匹配");

            }
        };

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
        //将comparator对象作为参数进行传入,排序
        Arrays.sort(products, comparator);

        System.out.println("排序之后");
        //排序后的遍历
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }


    }
}
