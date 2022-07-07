public class RangeExtraction {

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
        System.out.println(rangeExtraction(new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int secondIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            secondIndex = i;

            while (secondIndex < arr.length - 1 && arr[secondIndex] + 1 == arr[secondIndex + 1]) secondIndex++;

            if (i < secondIndex - 1) {
                i = secondIndex;
                sb.append("-").append(arr[i]);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
