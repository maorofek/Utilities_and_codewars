public class CheckForFactor {
    public static void main(String[] args) {
        System.out.println(checkForFactor(10, 2));
        System.out.println(checkForFactor(63, 7));
        System.out.println(checkForFactor(2450, 5));
    }

    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
