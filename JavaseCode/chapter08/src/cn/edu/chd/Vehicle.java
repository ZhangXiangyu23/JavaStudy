package cn.edu.chd;

/**
 * ClassName:Vehicle
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/22 9:13
 */
public abstract class Vehicle {
    private String brand;//品牌
    private String color;//颜色

    //空参构造器
    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*
    抽象方法
     */
    public abstract void run();
}
