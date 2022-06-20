import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

public class JosephusPermutation {

    public static void main(String[] args) {
        System.out.println(josephusPermutation(new Object[]{1, 2, 3, 4, 5, 6, 7}, 3)); // 3, 6, 2, 7, 5, 1, 4
    }

    public static <T> List<Object> josephusPermutation(final Object[] items, final int k) {
        int currentLocation = 0;
        List<Object> arr = Arrays.stream(items).collect(Collectors.toList());
        List<Object> resultList = new ArrayList<>();
        currentLocation += k;
        return resultList;
    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<T>();
        int index = 0;
        List<Integer> people = IntStream.rangeClosed(0, items.size() - 1)
                .boxed().collect(Collectors.toList());
        while (people.size() > 0) {
            index = (index + k - 1) % people.size();
            result.add(items.get(people.get(index)));
            people.remove(index);
        }
        return result;
    }
}