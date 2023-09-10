package cn.edu.chd;

/**
 * ClassName:Developer
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/22 9:29
 */
public class Developer {
    private String name;//姓名
    private int age;//年龄


    public Developer() {
    }

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
}
