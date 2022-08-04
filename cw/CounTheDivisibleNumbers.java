public class CounTheDivisibleNumbers {
    public static void main(String[] args) {
        System.out.println(divisibleCount(6, 11, 2));//3
        System.out.println(divisibleCount(1, 100, 11));
    }

    public static long divisibleCount(long a, long b, long k) {
        long count = 0;
        if (a % k == 0) {
            count = b / k - a / k + 1;
        } else {
            count = b / k - a / k;
        }
        return count;
    }
}