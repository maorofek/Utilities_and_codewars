public class HighestScoringWord {

    public static void main(String[] args) {

        System.out.println(high("man i need a taxi up to ubud")); //taxi
        System.out.println(high("what time are we climbing up to the volcano")); //volcano
        System.out.println(high("take me to semynak")); //semynak
    }

    public static String high(String s) {
        String[] words = s.split(" ");
        int maxValue = 0;
        String maxWord = "";
        for (String word : words) {
            int score = 0;
            for (int i = 0; i < word.length(); i++) {
                score += word.charAt(i) - 96;
            }
            if (score > maxValue) {
                maxValue = score;
                maxWord = word;
            }
        }
        return maxWord;
    }
}
