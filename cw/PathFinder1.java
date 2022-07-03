import java.util.ArrayList;
import java.util.List;

public class PathFinder1 {
    //Path Finder #1: can you reach the exit?

    public static void main(String[] args) {
        String a = ".W.\n" +
                ".W.\n" +
                "...",

                b = "   .W.\n" +
                        ".W.\n" +
                        "W..",

                c = "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        "......",

                d = "......\n" +
                        "......\n" +
                        "......\n" +
                        "......\n" +
                        ".....W\n" +
                        "....W.";

        long startTime = System.nanoTime();
        System.out.println(pathFinder(a));//true
        long endTime = System.nanoTime();
        double totalTime = (double) (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Time: " + totalTime);


        System.out.println(pathFinder(b));//false
        System.out.println(pathFinder(c));//true
        System.out.println(pathFinder(d));//false
    }

    static boolean pathFinder(String maze) {
        String[] lines = maze.split("\n");
        int[][] matrix = new int[lines.length][lines[0].length()];
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length(); j++) {
                matrix[i][j] = lines[i].charAt(j) == 'W' ? 0 : 1;
            }
        }
        return dfs(matrix, 0, 0);
    }

    static boolean dfs(int[][] matrix, int x, int y) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || matrix[x][y] == 0) {
            return false;
        }
        if (x == matrix.length - 1 && y == matrix[0].length - 1) {
            return true;
        }
        matrix[x][y] = 0;
        return dfs(matrix, x + 1, y) || dfs(matrix, x, y + 1);
    }

    static boolean bfs(int[][] matrix, int x, int y) {
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int[][] visited = new int[matrix.length][matrix[0].length];
        List<int[]> queue = new ArrayList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = 1;
        while (!queue.isEmpty()) {
            int[] curr = queue.remove(0);
            if (curr[0] == matrix.length - 1 && curr[1] == matrix[0].length - 1) {
                return true;
            }
            for (int[] direction : directions) {
                int newX = curr[0] + direction[0];
                int newY = curr[1] + direction[1];
                if (newX >= 0 && newX < matrix.length && newY >= 0 && newY < matrix[0].length && matrix[newX][newY] == 1 && visited[newX][newY] == 0) {
                    queue.add(new int[]{newX, newY});
                    visited[newX][newY] = 1;
                }
            }
        }
        return false;
    }

}
