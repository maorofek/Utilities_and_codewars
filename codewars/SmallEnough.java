import java.util.Arrays;

public class SmallEnough {

    public static void main(String[] args) {
        System.out.println(smallEnough(new int[]{66, 101}, 200));
        System.out.println(smallEnough(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100));
        System.out.println(smallEnough(new int[]{101, 45, 75, 105, 99, 107}, 107));
        System.out.println(smallEnough(new int[]{80, 117, 115, 104, 45, 85, 112, 115}, 120));
    }

    public static boolean smallEnough(int[] a, int limit) {
        int[] tmp = Arrays.stream(a).filter(x -> x <= limit).toArray();
        return tmp.length == a.length;
    }
}
