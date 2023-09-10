/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/26 19:42
 */

/*
4 3
human 2
monster 3
monster 10
monster 1
1 2 N Y
1 4 Y N
2 3 Y Y


YYYN
 */

import java.util.*;


class Unit {
    String identity;
    int power;
    boolean alive;

    public Unit(String identity, int power) {
        this.identity = identity;
        this.power = power;
        this.alive = true;
    }
}

public class BattleSimulation {
    public static void simulateEncounters(Unit[] units, int[][] encounters) {
        for (int i = 0; i < encounters.length; i++) {
            int u = encounters[i][0];
            int v = encounters[i][1];
            char c1 = (char) encounters[i][2];
            char c2 = (char) encounters[i][3];

            Unit unitU = units[u - 1];
            Unit unitV = units[v - 1];

            if (c1 == 'Y') {
                unitU.identity = "human";
            }
            if (c2 == 'Y') {
                unitV.identity = "human";
            }

            if (unitU.alive && unitV.alive) {
                if (unitU.identity.equals("human") && unitV.identity.equals("monster")) {
                    if (unitU.power > unitV.power) {
                        unitV.alive = false;
                    } else if (unitU.power < unitV.power) {
                        unitU.alive = false;
                    }
                } else if (unitU.identity.equals("monster") && unitV.identity.equals("human")) {
                    if (unitU.power >= unitV.power) {
                        unitV.alive = false;
                    } else {
                        unitU.alive = false;
                    }
                } else if (unitU.identity.equals("monster") && unitV.identity.equals("monster")) {
                    if (unitU.power != unitV.power) {
                        if (unitU.power > unitV.power) {
                            unitV.alive = false;
                        } else {
                            unitU.alive = false;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //输入
        Scanner scanner = new Scanner(System.in);
        //输入n个单元
        int n = scanner.nextInt();
        //m轮比赛
        int m = scanner.nextInt();

        //n个选手
        Unit[] units = new Unit[n];
        for (int i = 0; i < n; i++) {
            String identity = scanner.next();
            int power = scanner.nextInt();
            units[i] = new Unit(identity, power);
        }
        //m轮次的遭遇
        int[][] encounters = new int[m][4];
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            char c1 = scanner.next().charAt(0);
            char c2 = scanner.next().charAt(0);
            encounters[i] = new int[]{u, v, c1, c2};
        }

        simulateEncounters(units, encounters);

        StringBuilder result = new StringBuilder();
        for (Unit unit : units) {
            result.append(unit.alive ? 'Y' : 'N');
        }
        System.out.println(result.toString());
    }
}
