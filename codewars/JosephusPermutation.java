import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

public class JosephusPermutation {

    public static void main(String[] args) {
        System.out.println(josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3));
        //3, 6, 2, 7, 5, 1, 4}
    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<T>();
        int index = 0;
        List<Integer> people = IntStream.rangeClosed(0, items.size()-1)
                .boxed().collect(Collectors.toList());
        while (people.size() > 0) {
            index = (index + k - 1) % people.size();
            result.add(items.get(people.get(index)));
            people.remove(index);
        }
        return result;
    }
}