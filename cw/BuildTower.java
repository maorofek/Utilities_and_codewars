import java.util.Arrays;

public class BuildTower {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(3)));//(",", " * ", "***")


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
  /*
  public static String[] TowerBuilder(int n) {
    String t[] = new String[n], e;

    for (int i = 0; i < n; i++)
        t[i] = (e = " ".repeat(n-i-1)) + "*".repeat(i+i+1) + e;

    return t;
}
    */