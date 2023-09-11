package cn.edu.chd.exer3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName:MapSet
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/11 16:06
 */
public class MapSet {
    public static void main(String[] args) {
        //遍历hashmap中的key
        Set keyset = CityMap.model.keySet();
        //调用迭代器方法
        Iterator iterator = keyset.iterator();
        //开始迭代
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        //换行
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请选择你所在的省份:");
        String choose = scanner.next();

//        //获取values
//        Collection values = CityMap.model.values();
//        //遍历V
//        for (Object obj:values) {
//            System.out.print(obj+ " ");
//        }

        String[] cities = (String[])CityMap.model.get(choose);
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " ");
        }

        System.out.println();
        System.out.print("请你选择所在的城市:");
        String city = scanner.next();
        //对城市进行检查

        System.out.println("信息登记完毕");

        //关闭流
        scanner.close();

    }

}
