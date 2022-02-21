import java.util.Arrays;

public class MergeAndSortTwoArrayToOne {

    public static void main(String[] args) {
        String[] zzzz = inArray(new String[]{"a", "c", "e"}, new String[]{"g", "d", "f", "b", "h"});
        for (String str :
                zzzz) {
            System.out.println(str);

        }

    }

    public static String[] inArray(String[] array1, String[] array2) {
        String[] strArr = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, strArr, 0, array1.length);
        System.arraycopy(array2, 0, strArr, array1.length, array2.length);

        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareToIgnoreCase(strArr[j])
                        > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
        return strArr;
    }
}