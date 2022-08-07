import java.util.Arrays;

public class BuildTower {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(4)));//(",", " * ", "***")


    }

    public static String[] towerBuilder(int nFloors) {
        if (nFloors == 0) {
            return new String[]{};
        }
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < nFloors - i - 1; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                sb.append("*");
            }
            for (int j = 0; j < nFloors - i - 1; j++) {
                sb.append(" ");
            }
            tower[i] = sb.toString();
        }
        return tower;
    }
}