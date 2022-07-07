public class TakeATenMinutesWalk {

    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(isValid(new char[]{'w'}));
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));

    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int x = 0;
        int y = 0;
        for (char c : walk) {
            if (c == 'n') {
                x++;
            } else if (c == 's') {
                x--;
            } else if (c == 'w') {
                y++;
            } else if (c == 'e') {
                y--;
            }
        }
        return x == 0 && y == 0;
    }
}
