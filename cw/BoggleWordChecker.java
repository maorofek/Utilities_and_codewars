public class BoggleWordChecker {
    private final char[][] board;
    private final String word;

    public BoggleWordChecker(final char[][] board, final String word) {
        this.board = board;
        this.word = word;
    }

    public boolean check() {
        if (word == null || word.isEmpty()) {
            return false;
        }
        int[][] usedCoords = new int[board.length][board[0].length];

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (board[y][x] == word.charAt(0) && isMatch(x, y, 1, usedCoords))
                    return true;
            }
        }
        return false;
    }

    private boolean isMatch(int last_x, int lats_y, int currentIndex, int[][] usedCoords) {
        if (currentIndex >= word.length()) return true;

        char currentChar = word.charAt(currentIndex);
        usedCoords[lats_y][last_x] = 1;

        for (int y = lats_y - 1; y <= lats_y + 1; y++) {
            for (int x = last_x - 1; x <= last_x + 1; x++) {
                if (y >= 0 && x >= 0 && y < board.length && x < board[y].length) {
                    if (board[y][x] == currentChar && usedCoords[y][x] != 1 &&
                            isMatch(x, y, currentIndex + 1, usedCoords))
                        return true;
                }
            }
        }
        usedCoords[lats_y][last_x] = 0;
        return false;
    }
}