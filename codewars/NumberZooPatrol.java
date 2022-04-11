public class NumberZooPatrol {

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1, 3})); // 2
        System.out.println(findMissingNumber(new int[]{1, 3, 4})); // 2
        System.out.println(findMissingNumber(new int[]{13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8})); // 12
    }

    public static int findMissingNumber(int[] numbers) {
        int max = numbers.length + 1;
        int missingNumber = 0;

        boolean[] bools = new boolean[max + 1];

        for (int i : numbers) {
            bools[i] = true;
        }

        for (int i = 1; i < bools.length; i++) {
            if (!bools[i]) {
                missingNumber = i;
            }
        }
        return missingNumber;
    }
}
