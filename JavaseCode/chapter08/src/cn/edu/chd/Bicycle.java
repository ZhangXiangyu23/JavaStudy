package cn.edu.chd;

/**
 * ClassName:Bicycle
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/22 9:16
 */
public class Bicycle extends Vehicle{

    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车是用脚瞪");
    }
}
