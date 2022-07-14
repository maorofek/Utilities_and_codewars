public class findEvenIndex {

    public static int findEvenIndex(int[] arr) {
        int index=0,sumL,sumR;
        while (index++ < arr.length - 1) {
            sumL = sumR = 0;
            for (int i = 0; i < index; i++) sumL += arr[i];
            for (int j = arr.length - 1; j > index; j--) sumR += arr[j];
            if (sumL == sumR) return index;
        }
        return -1;  }
}
