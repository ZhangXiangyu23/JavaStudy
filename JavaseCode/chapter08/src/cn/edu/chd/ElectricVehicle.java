package cn.edu.chd;

/**
 * ClassName:ElectricVehicle
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/22 9:23
 */
public class ElectricVehicle extends Vehicle implements IPower{

    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("开电动汽车");
    }

    @Override
    public void power() {
        System.out.println("电动汽车靠电能");
    }
}
