package zxy.JiTiao02;

/**
 * ClassName:Main
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/11/26 14:44
 */
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int height;

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Student other) {
        // 降序排序
        return Integer.compare(other.height, this.height);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读入人数
        int n = scanner.nextInt();
        String[] names = new String[n];
        int[] heights = new int[n];

        //读入姓名
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }

        //读入身高
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        // 创建学生数组
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(names[i], heights[i]);
        }

        Arrays.sort(students);
        //输出
        System.out.println(Arrays.toString(students));
    }
}

