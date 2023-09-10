/**
 * ClassName:test2
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/8/26 19:56
 */
import java.util.*;

class Unit1 {
    String identity;
    int power;
    boolean alive;

    public Unit1(String identity, int power) {
        this.identity = identity;
        this.power = power;
        this.alive = true;
    }
}

public class BattleSimulation1 {
    public static void simulateEncounters(Unit[] units, int[][] encounters) {
        for (int i = 0; i < encounters.length; i++) {
            int u = encounters[i][0];
            int v = encounters[i][1];
            char c1 = (char) encounters[i][2];
            char c2 = (char) encounters[i][3];

            Unit unitU = units[u - 1];
            Unit unitV = units[v - 1];

            if (c1 == 'Y') {
                unitU.identity = "人";
            }
            if (c2 == 'Y') {
                unitV.identity = "人";
            }

            if (unitU.alive && unitV.alive) {
                if (unitU.identity.equals("人") && unitV.identity.equals("兽")) {
                    if (unitU.power > unitV.power) {
                        unitV.alive = false;
                    } else if (unitU.power < unitV.power) {
                        unitU.alive = false;
                    }
                } else if (unitU.identity.equals("兽") && unitV.identity.equals("人")) {
                    if (unitU.power >= unitV.power) {
                        unitV.alive = false;
                    } else {
                        unitU.alive = false;
                    }
                } else if (unitU.identity.equals("兽") && unitV.identity.equals("兽")) {
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Unit[] units = new Unit[n];
        for (int i = 0; i < n; i++) {
            String identity = scanner.next();
            int power = scanner.nextInt();
            units[i] = new Unit(identity, power);
        }

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
