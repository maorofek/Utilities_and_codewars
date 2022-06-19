import java.util.ArrayList;
import java.util.List;

public class TwoToOne {

    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));//aehrsty
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));//abcdefghilnoprstu
        System.out.println(longest("inmanylanguages", "theresapairoffunctions"));//acefghilmnoprstuy

    }

    public static String longest(String s1, String s2) {
        String newString;
        // get two strings and return one sorted string in alphabetical order of the two strings  with no duplicates
        return (s1 + s2)
                .chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
