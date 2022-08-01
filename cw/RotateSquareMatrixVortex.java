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
        int[][] res = rotateLikeAVortex(matrix);
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
        replaceInsideMat(arr, insideMat);
        return arr;
    }

    static void replaceInsideMat(int[][] arr, int[][] insideMat) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                arr[i][j] = insideMat[i - 1][j - 1];
            }
        }
    }

    static int[][] cutInsideMatrix(int[][] arr, double size) {
        // copy the matrix without the first and last row and column to another matrix  (size - 2) * (size - 2)
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