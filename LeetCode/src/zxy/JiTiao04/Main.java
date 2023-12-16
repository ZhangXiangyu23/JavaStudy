package zxy.JiTiao04;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/26 15:16
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取输入
        String moves = scanner.nextLine();
        // 起点
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
                    break;
            }
        }

        // 是否在家的位置坐标（0，5）
        System.out.println((x == 5 && y == 0) ? "Yes" : "No");
    }
}

