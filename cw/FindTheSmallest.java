import java.util.Arrays;

public class FindTheSmallest {

    public static void main(String[] args) { // {new number,old position,new position}
//        System.out.println(Arrays.toString(smallest(261235))); //"[126235, 2, 0]");
        System.out.println(Arrays.toString(smallest(209917))); //"[29917, 0, 1]");
//        System.out.println(Arrays.toString(smallest(285365))); //"[238565, 3, 1]");
//        System.out.println(Arrays.toString(smallest(269045))); //"[26945, 3, 0]");
//        System.out.println(Arrays.toString(smallest(296837))); //"[239687, 4, 1]");


    }

    public static long[] smallest(long n) {
        long smallestNumber = getSmallerNum(n);
        int smallestIndex = getSmallestIndex(n, smallestNumber);
        long newNumber = removeTheDigitFromTheNumber(n, smallestIndex);
        return checkWhichOneIsTheSmaller(newNumber, smallestNumber, smallestIndex);
    }

    //TODO
    private static long[] checkWhichOneIsTheSmaller(long newNumber, long smallestNumber, int smallestIndex) {
        if (smallestNumber == 0) {
            return new long[]{newNumber, smallestIndex, 0};
        }
        String tmpStr = Long.toString(newNumber);
        long tmpSmallestNumber = newNumber * 10 + smallestNumber;
        int newIndex = 0;
        for (int i = 1; i <= tmpStr.length(); i++) {
            long cut = (long) (newNumber % (Math.pow(10, i)));
            long x = (long) ((long) ((int) (newNumber / (Math.pow(10, i))) * 10 + smallestNumber) * (Math.pow(10, i)) + cut); //TODO
            if (x < tmpSmallestNumber) {
                tmpSmallestNumber = x;
                newIndex = tmpStr.length() - i;
            }
        }
        return new long[]{tmpSmallestNumber, smallestIndex, newIndex};
    }

    private static long removeTheDigitFromTheNumber(long n, int indexSmallest) {
        String str = String.valueOf(n);
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != indexSmallest) {
                tmp.append(str.charAt(i));
            }
        }
        return Long.parseLong(tmp.toString());
    }

    private static int getSmallestIndex(long n, long smallestNumber) {
        String str = String.valueOf(n);
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Integer.parseInt(String.valueOf(str.charAt(i))) == smallestNumber) {
                index = i;
            }
        }
        return index;
    }

    private static int getLen(long n) {
        int len = 0;
        while (n > 0) {
            n /= 10;
            len++;
        }
        return len;
    }

    private static int getSmallerNum(long n) {
        int smallest = 9;
        long tmp = n;
        int index = 0;
        while (tmp != 0) {
            long z = tmp % 10;
            smallest = (int) Math.min(z, smallest);
            if (smallest == z) {
                index++;
            }
            tmp = tmp / 10;
        }
        return smallest;
    }
}
