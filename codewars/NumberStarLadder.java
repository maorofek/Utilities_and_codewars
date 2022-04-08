import static java.util.stream.Collectors.joining;
import static java.util.stream.LongStream.rangeClosed;

public class NumberStarLadder {

    public static void main(String[] args) {
        String a1 = "1\n1*2\n1**3";
        String a2 = "1\n1*2\n1**3\n1***4\n1****5\n1*****6\n1******7";
        String a3 = "1\n1*2\n1**3\n1***4\n1****5\n1*****6\n1******7\n1*******8\n1********9\n1*********10\n1**********11\n1***********12\n1************13\n1*************14\n1**************15\n1***************16\n1****************17\n1*****************18\n1******************19\n1*******************20";
        System.out.println(pattern(5));
    }

    public static String pattern(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        for (int i = 1; i < n; i++) {
            stringBuilder.append("\n");
            stringBuilder.append(1);
            for (int j = 0; j < i; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append(i + 1);
        }
        return stringBuilder.toString();
    }

    //solve with methode of JAVA 11
//    public static String pattern2(int n) {
//        return rangeClosed(1, n).mapToObj(i -> "1" + "*".repeat(i - 1) + (i > 1 ? i : "")).collect(joining("\n"));
//    }
}