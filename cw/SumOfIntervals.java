import java.util.*;
import java.util.stream.IntStream;

public class SumOfIntervals {

    public static void main(String[] args) {
        System.out.println(sumIntervals2(new int[][]{{4, 4}, {6, 6}, {8, 8}})); //0
        System.out.println(sumIntervals2(new int[][]{}));//0
        System.out.println(sumIntervals2(new int[][]{{1, 2}, {6, 10}, {11, 15}})); //0
        System.out.println(sumIntervals2(new int[][]{{4, 8}, {9, 10}, {15, 21}})); //9
        System.out.println(sumIntervals2(new int[][]{{-1, 4}, {-5, -3}})); //7
        System.out.println(sumIntervals2(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}}));
        System.out.println(sumIntervals2(new int[][]{{1, 2}, {2, 6}, {6, 55}}));
        System.out.println(sumIntervals2(new int[][]{{-2, -1}, {-1, 0}, {0, 21}}));
        System.out.println(sumIntervals2(new int[][]{{1, 4}, {7, 10}, {3, 5}}));
        System.out.println(sumIntervals2(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
        System.out.println(sumIntervals2(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
        System.out.println(sumIntervals2(new int[][]{{-101, 24}, {-35, 27}, {27, 53}, {-105, 20}, {-36, 26}}));
    }

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null) return 0;
        List<Integer> list = new ArrayList<>();
        for (int[] interval : intervals) {
            for (int i = interval[0]; i < interval[1]; i++) {
                list.add(i);
            }
        }
        Set<Integer> set = new HashSet<>(list);
        return set.size();
    }

    public static int sumIntervals2(int[][] intervals) {
        return intervals.length == 0 ? 0 : (int) Arrays.stream(intervals)
                .flatMapToInt(i -> IntStream.range(i[0], i[1]))
                .distinct()
                .count();
    }
}