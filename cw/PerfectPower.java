public class PerfectPower {
    public static void main(String[] args) {

    }

    public static int[] isPerfectPower(int n) {
        double sqrt = Math.sqrt(n);
        for (int i = 2, j = 2; i <= sqrt; ) {
            int currentPow = (int) Math.pow(i, j);
            if (currentPow == n) {
                return new int[]{i, j};
            } else if (currentPow > n) {
                i++;
                j = 2;
            } else {
                j++;
            }
        }
        return null;
    }
}
