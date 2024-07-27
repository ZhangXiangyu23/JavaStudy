package practice.haikang;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2024/5/9 19:48
 */
import java.util.Scanner;

public class Main {
    // 辅助方法：仅使用加号，生成负数
    private static int addNegatives(int num) {
        int negative = 0;
        for (int i = 0; i < Math.abs(num); i++) {
            negative += (num > 0 ? -1 : 1);
        }
        return negative;
    }

    // 辅助方法：模拟减法
    private static int subtract(int a, int b) {
        // 反复添加 -1 直到 b 为 0
        int decrement = addNegatives(-1);  // 创建 -1
        for (int i = 0; i < b; i++) {
            a += decrement;
        }
        return a;
    }

    // 辅助方法：模拟乘法
    private static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    // 辅助方法：模拟整除
    private static int divide(int a, int b) {
        int count = 0;
        int product = 0;
        while (product + b <= a) {
            product += b;
            count++;
        }
        return count;
    }

    // 主方法：根据操作类型执行运算
    public static int calculate(int a, int b, int type) {
        switch (type) {
            case 1:  // 乘法
                return multiply(a, b);
            case 0:  // 整除
                return divide(a, b);
            case -1:  // 减法
                return subtract(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer (a):");
        int a = scanner.nextInt();

        System.out.println("Enter second integer (b):");
        int b = scanner.nextInt();

        System.out.println("Enter operation type (1 for multiplication, 0 for division, -1 for subtraction):");
        int type = scanner.nextInt();

        // 计算并打印结果
        int result = calculate(a, b, type);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
