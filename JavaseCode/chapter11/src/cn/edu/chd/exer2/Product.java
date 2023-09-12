package cn.edu.chd.exer2;

import java.util.Objects;

/**
 * ClassName:Product
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/12 15:23
 */
public class Product implements Comparable{
    private String name;
    private double prices;

    //无参构造
    public Product() {
    }

    //全参构造
    public Product(String name, double prices) {
        this.name = name;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prices=" + prices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.prices, prices) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prices);
    }

    @Override
    public int compareTo(Object o) {
        //如果是同一个对象，return 0
        if (this == o){
            return 0;
        }

        //两个对象比较的标准是：价格从小到大，价格一样的话，按照名字从小到大
        if (o instanceof Product){
            Product p = (Product)o;
            int v = Double.compare(this.prices, p.prices);
//            return v;
            if (v != 0){
                return v;
            }
            //价格如果相同，名字按照从小到大
            return this.name.compareTo(p.name);
        }
        //手动抛异常
        throw new RuntimeException("类型不匹配");

    }
}
