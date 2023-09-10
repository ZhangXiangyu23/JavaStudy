package cn.chd.array;

/**
 * ClassName:LinerSearch
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/7 9:52
 */
public class LinerSearch {
    public static void main(String[] args) {
        int [] a = new int[]{5, 10, 1, 18, 7, 12};
        //方式一
        int target = 1;
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target){
                System.out.println("找到了"+target+",下标索引为"+i);
                flag = false;
                break;
            }

        }
        if (flag){
            System.out.println("在数组中没有找到"+target);
        }
        //方式二
//        int i = 0;
//        for (; i < a.length; i++) {
//            if (a[i] == target){
//                System.out.println("找到了"+target+",下标索引为"+i);
//                break;
//            }
//
//        }
//        if (i == a.length){
//            System.out.println("在数组中没有找到"+target);
//        }
    }
}
