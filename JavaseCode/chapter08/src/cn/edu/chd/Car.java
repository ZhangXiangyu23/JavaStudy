package cn.edu.chd;

/**
 * ClassName:Car
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/22 9:20
 */
public class Car extends Vehicle implements IPower{
    private String carNumber;


    public Car() {
    }

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("开燃油汽车");
    }

    @Override
    public void power() {
        System.out.println("燃油汽车靠汽油");
    }
}
