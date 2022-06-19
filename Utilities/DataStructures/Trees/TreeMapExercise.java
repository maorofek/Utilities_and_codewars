package DataStructures.Trees;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class TreeMapExercise {


    public static void main(String[] args) throws IOException {
        // לשמור מילה ובאיזה מספרי שורות היא מופיעה
        // ככה שתוכל לחפש מילה בDB ותדע באיזה שורות היא מופיעה
        // להדפיס את כל המילים בסדר אלפבתי ובאיזה שורות הן מופיעות

        File file = new File("src/BibleKingJamesEdition.txt");
        MyDataStructure myDataStructure = readFile(file);
        System.out.println(myDataStructure.getAllRows("moses"));
        // System.out.println(myDataStructure);
    }


    public static MyDataStructure readFile(File file) throws IOException {
        long start = System.currentTimeMillis();

        MyDataStructure myDataStructure = new SelectedDataStructure();


        //O(n) when n is the number of lines
        String[] lines = Files.lines(file.toPath()).toArray(String[]::new);

        for (int i = 0; i < lines.length; i++) {
            if (!lines[i].isEmpty())
                /*
                    Regex and Split operations - O(num of chars in line) per line -> O(num of chars in file) in total
                    We check with regex and leave only letters and whitespaces, then split by whitespaces
                 */
                for (String word :
                        lines[i]
                                .replaceAll("-", " ")
                                .replaceAll("[^\\p{Alpha}\\s]", "")
                                .trim()
                                .split("\\s+")
                ) {
                    if (!word.isEmpty() && checkForOneLetterWords(word)) {
                        myDataStructure.insert(word.toLowerCase(), i + 1);
                    }
                }
        }
        System.out.println(
                "File Processed In " + (System.currentTimeMillis() - start) + "ms (" + lines.length + " lines)"
        );

        return myDataStructure;
    }

    private static boolean checkForOneLetterWords(String word) {
        return word.length() != 1 || "aioAIO".contains(word);
    }
}

interface MyDataStructure {
    void insert(String word, int lineNumber);

    List<Integer> getAllRows(String word);
}

class SelectedDataStructure implements MyDataStructure {

    SortedMap<String, List<Integer>> map = new TreeMap<>();

    @Override
    public void insert(String word, int lineNumber) {
        if (!map.containsKey(word)) {
            map.put(word, new LinkedList<>());
        }
        map.get(word).add(lineNumber);
    }

    @Override
    public List<Integer> getAllRows(String word) {
        return map.get(word);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : map.keySet()) {
            sb.append(word).append(" Located in rows: ").append(map.get(word)).append("\n");
        }
        return sb.toString();
    }

}
