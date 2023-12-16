package zxy.test2;

import java.util.*;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/12 15:08
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        //输入
        for (int i = 0;i<10;i++){
            int e = scanner.nextInt();
            a.add(e);
        }

        //遍历set，将set中元素放到数组中
        Iterator<Integer> iterator = a.iterator();
        int[]  result = new int[a.size()];
        int i = 0;
        while (iterator.hasNext()){
            result[i] = iterator.next();
            i++;
        }
        //排序
        Arrays.sort(result);
        //输出
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

    }
}
