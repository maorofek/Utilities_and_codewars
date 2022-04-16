public class CanYouReachThrExit {

    public static void main(String[] args) {
        String a =  ".W.\n" +
                    ".W.\n" +
                    "...";

        String b =  ".W.\n" +
                    ".W.\n" +
                    "W..";

        String c =  "......\n" +
                    "......\n" +
                    "......\n" +
                    "......\n" +
                    "......\n" +
                    "......";

        String d =  "......\n" +
                    "......\n" +
                    "......\n" +
                    "......\n" +
                    ".....W\n" +
                    "....W.";
        System.out.println(pathFinder(a));
        System.out.println(pathFinder(b));
        System.out.println(pathFinder(c));
        System.out.println(pathFinder(d));

    }

    static boolean pathFinder(String maze) {

        return false;
    }
}
