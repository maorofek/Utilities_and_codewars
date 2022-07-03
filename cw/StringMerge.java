public class StringMerge {

    public static void main(String[] args) {
        System.out.println(stringMerge("person", "here", 'e').equals("pere"));
        System.out.println(stringMerge("person", "here", 'e'));
        System.out.println(stringMerge("apowiejfoiajsf", "iwahfeijouh", 'j').equals("apowiejouh"));
        System.out.println(stringMerge("abcdefxxxyzz", "abcxxxyyyxyzz", 'x').equals("abcdefxxxyyyxyzz"));
    }

    public static String stringMerge(String s1, String s2, char letter) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == letter) {
                i = s1.length();
            } else {
                tmp.append(s1.charAt(i));
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == letter) {
                for (int j = i; j < s2.length(); j++) {
                    tmp.append(s2.charAt(j));
                }
                return tmp.toString();

            }
        }
        return tmp.toString();
    }

    //sol from codewars
    public static String stringMerge2(String s1, String s2, char letter) {
        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }
}