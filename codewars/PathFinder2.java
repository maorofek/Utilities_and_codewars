public class PathFinder2 {
    //Path Finder #2: shortest path exercise
    public static void main(String[] args) {
        String a = ".W.\n" +
                ".W.\n" +
                "...",

                b = ".W.\n" +
                        ".W.\n" +
                        "W..",

                c = "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        "......",

                d = "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        ".....W\n" +
                        "....W.";

        System.out.println(pathFinder(a)); //4
        System.out.println(pathFinder(b));//-1
        System.out.println(pathFinder(c));//10
        System.out.println(pathFinder(d));//-1
    }

    //TODO
    public static int pathFinder(String maze) {

        return -1;
    }
}
