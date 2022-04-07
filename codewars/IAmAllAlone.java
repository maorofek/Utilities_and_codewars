public class IAmAllAlone {
    public static void main(String[] args) {
        char[][] house = {
                "  o                o        #######".toCharArray(),
                "###############             #     #".toCharArray(),
                "#             #        o    #     #".toCharArray(),
                "#  X          ###############     #".toCharArray(),
                "#                                 #".toCharArray(),
                "###################################".toCharArray()
        };
        char[][] house2 = {
                "#################             ".toCharArray(),
                "#     o         #   o         ".toCharArray(),
                "#          ######        o    ".toCharArray(),
                "####       #                  ".toCharArray(),
                "   #       ###################".toCharArray(),
                "   #                         #".toCharArray(),
                "   #                  X      #".toCharArray(),
                "   ###########################".toCharArray()
        };
        System.out.println(allAlone(house));
        System.out.println(allAlone(house2));

    }

    public static boolean allAlone(char[][] house) {
        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[i].length; j++) {
                if (house[i][j] == 'o') {
                    int[] row = checkRow(i, j, house);
                    int[] col = checkCol(i, j, house);
                    if (row[0] == 2 && col[0] == 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static int[] checkRow(int currentRow, int currentCol, char[][] house) {
        int counter = 0;
        int presidentCounter = 0;
        for (int i = 0; i < house[currentRow].length; i++) {
            if (house[currentRow][i] == '#') {
                if (counter == 0 && i < currentCol) {
                    counter++;
                }
                if (house[currentRow][i] == 'X') {
                    presidentCounter++;
                }
                if (counter == 1 && i > currentCol) {
                    counter++;
                }
            }
        }
        return new int[]{counter, presidentCounter};
    }


    public static int[] checkCol(int currentRow, int currentCol, char[][] house) {
        int counter = 0;
        int presidentCounter = 0;
        for (int i = 0; i < house.length; i++) {
            if (house[i][currentCol] == '#') {
                if (counter == 0 && i < currentRow) {
                    counter++;
                }
                if (house[i][currentCol] == 'X') {
                    presidentCounter++;
                }
                if (counter == 1 && i > currentRow) {
                    counter++;
                }
            }
        }
        return new int[]{counter, presidentCounter};
    }

}
