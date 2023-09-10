package cn.edu.chd.exer2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName:SetTest
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/10 16:58
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        for (int i = 0; i < 10; i++) {
            set.add((int)(Math.random() * (20-1+1)+1));

        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}


