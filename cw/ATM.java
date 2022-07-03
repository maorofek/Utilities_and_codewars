public class ATM {

    public static void main(String[] args) {
        System.out.println(solve2(770)); // 4
        System.out.println(solve(125)); // -1
        System.out.println(solve(550)); // 2
        System.out.println(solve(10)); // 1
        System.out.println(solve(238)); // -1
    }

    public static int solve(int n) {
        int numOfBankNotes = 0;
        int sum = 0;
        while (sum < n) {
            if (sum + 500 <= n) {
                sum += 500;
                numOfBankNotes++;
            } else if (sum + 200 <= n) {
                sum += 200;
                numOfBankNotes++;
            } else if (sum + 100 <= n) {
                sum += 100;
                numOfBankNotes++;
            } else if (sum + 50 <= n) {
                sum += 50;
                numOfBankNotes++;
            } else if (sum + 20 <= n) {
                sum += 20;
                numOfBankNotes++;
            } else if (sum + 10 <= n) {
                sum += 10;
                numOfBankNotes++;
            } else {
                return -1;
            }
            if (sum == n) {
                break;
            }
        }
        return numOfBankNotes;
    }

    //another answer
    public static int solve2(int n) {
        int[] arr = new int[]{500, 200, 100, 50, 20, 10};
        int sum = 0;
        for (int number : arr) {
            sum += n / number;
            n %= number;
        }

        return n == 0 ? sum : -1;
    }

}
