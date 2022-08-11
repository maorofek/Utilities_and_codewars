import java.util.Arrays;

public class RotateSquareMatrixVortex {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                new int[]{5, 3, 6, 1},
                new int[]{5, 8, 7, 4},
                new int[]{1, 2, 4, 3},
                new int[]{3, 1, 2, 2}};
        int[][] expected = new int[][]{
                new int[]{1, 4, 3, 2},
                new int[]{6, 4, 2, 2},
                new int[]{3, 7, 8, 1},
                new int[]{5, 5, 1, 3}};

        int[][] newTest = new int[][]{
                new int[]{8, 4, 5, 4, 5, 5, 7, 4, 1, 4, 2, 7, 2},
                new int[]{4, 4, 7, 3, 1, 6, 4, 1, 3, 7, 9, 6, 1},
                new int[]{5, 8, 9, 1, 4, 2, 5, 9, 1, 8, 9, 9, 5},
                new int[]{3, 4, 4, 9, 6, 3, 7, 3, 8, 6, 5, 5, 1},
                new int[]{3, 1, 1, 6, 1, 1, 9, 2, 6, 8, 4, 8, 9},
                new int[]{4, 9, 8, 8, 1, 1, 6, 4, 8, 1, 1, 7, 8},
                new int[]{6, 1, 7, 4, 6, 4, 3, 4, 9, 2, 2, 1, 6},
                new int[]{8, 7, 2, 1, 8, 3, 9, 9, 2, 5, 8, 3, 4},
                new int[]{4, 6, 4, 8, 4, 6, 2, 5, 2, 7, 9, 5, 8},
                new int[]{6, 1, 3, 7, 4, 6, 1, 3, 9, 1, 6, 5, 3},
                new int[]{6, 7, 8, 3, 2, 5, 1, 9, 8, 5, 6, 6, 9},
                new int[]{2, 6, 2, 7, 8, 5, 4, 9, 4, 4, 1, 2, 1},
                new int[]{3, 4, 9, 2, 4, 3, 1, 2, 6, 2, 4, 5, 6}};

        int[][] res = rotateLikeAVortex(newTest);

        printMatrix(res);

    }

    //TODO
    static int[][] rotateLikeAVortex(int[][] arr) {
        double size = arr.length;
        transpose(arr);
        reverseColumns(arr);
        int[][] insideMat = cutInsideMatrix(arr, size);
        transpose(insideMat);
        reverseColumns(insideMat);
        //copy arr to a new matrix
        int[][] res = new int[(int) size][(int) size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[i][j] = arr[i][j];
            }
        }
        replaceInsideMat(res, insideMat);
        return res;
    }

    static void replaceInsideMat(int[][] arr, int[][] insideMat) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                arr[i][j] = insideMat[i - 1][j - 1];
            }
        }
    }

    static int[][] cutInsideMatrix(int[][] arr, double size) {
        int[][] insideMat = new int[(int) (size - 2)][(int) (size - 2)];
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                insideMat[i - 1][j - 1] = arr[i][j];
            }
        }
        return insideMat;
    }

    static void transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
    }

    static void reverseColumns(int arr[][]) {
        for (int i = 0; i < arr[0].length; i++)
            for (int j = 0, k = arr[0].length - 1; j < k;
                 j++, k--) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }
}