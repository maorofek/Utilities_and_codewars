public class SudokuValidator {
    static final int SQRT_SIZE = 3;
    static final int SUDOKU_SIZE = 9;


    public static void main(String[] args) {

        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(check(sudoku));
    }

    public static boolean check(int[][] sudoku) {
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (!isValidSudokuRow(i, sudoku) || !isValidSudokuCol(i, sudoku))
                return false;
        }
        for (int i = 0; i < SQRT_SIZE; i++) {
            for (int j = 0; j < SQRT_SIZE; j++) {
                if (!checkQuarterSudoku(i, j, sudoku)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidSudokuRow(int indexRow, int[][] sudoku) {
        boolean[] checkArr = new boolean[SUDOKU_SIZE];
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (((sudoku[indexRow][i] >= 1) && (sudoku[indexRow][i] <= 10)) && !checkArr[sudoku[indexRow][i] - 1]) {
                checkArr[sudoku[indexRow][i] - 1] = true;
            } else {
                return false;
            }
        }
        for (boolean b : checkArr) {
            if (!b)
                return false;
        }
        return true;
    }

    public static boolean isValidSudokuCol(int indexCol, int[][] sudoku) {
        boolean[] checkArr = new boolean[SUDOKU_SIZE];
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (((sudoku[indexCol][i] >= 1) && (sudoku[indexCol][i] <= 10)) && !checkArr[sudoku[i][indexCol] - 1]) {
                checkArr[sudoku[i][indexCol] - 1] = true;
            } else {
                return false;
            }
        }
        for (boolean b : checkArr) {
            if (!b)
                return false;
        }
        return true;
    }

    public static boolean checkQuarterSudoku(int _row, int _col, int[][] sudoku) {
        boolean[] checkArr = new boolean[SUDOKU_SIZE];
        for (int row = 0; row < SQRT_SIZE; row++) {
            for (int col = 0; col < SQRT_SIZE; col++) {
                if (!checkArr[sudoku[_row * SQRT_SIZE + row][_col * SQRT_SIZE + col] - 1]) {
                    checkArr[sudoku[_row * SQRT_SIZE + row][_col * SQRT_SIZE + col] - 1] = true;
                } else {
                    return false;
                }
            }
        }
        for (boolean b : checkArr) {
            if (!b)
                return false;
        }
        return true;
    }
}
