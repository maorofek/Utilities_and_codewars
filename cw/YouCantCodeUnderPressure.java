public class YouCantCodeUnderPressure {

    public static void main(String[] args) {
        System.out.println(doubleInteger(7));
    }

    public static int doubleInteger(int i) {
        return Double.valueOf(i).intValue() * 2;
    }
}
