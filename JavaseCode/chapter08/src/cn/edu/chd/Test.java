package cn.edu.chd;

/**
 * ClassName:Test
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/22 9:35
 */
public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "红色");
        vehicles[1] = new Car("奔驰", "黑色", "晋A");
        vehicles[2] = new ElectricVehicle("特斯拉", "白色");


        Developer developer = new Developer("java义父——吕雪阳", 22);
        //我直接循环调用
        for (int i = 0; i < vehicles.length; i++) {
                developer.takingVehicle(vehicles[i]);
                //测试接口的实现
                if (vehicles[i] instanceof IPower){
                    ((IPower) vehicles[i]).power();
                }

        }

    }
}
