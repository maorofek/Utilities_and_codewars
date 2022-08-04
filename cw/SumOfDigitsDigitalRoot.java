public class SumOfDigitsDigitalRoot {


    public static void main(String[] args) {
        System.out.println(digital_root(16));//7
        System.out.println(digital_root(456));//6
        System.out.println(digital_root(132189));//6
    }

    public static int digital_root(int n) {
        while (n > 9) {
            n = n / 10 + n % 10;
        }
        return (n);
    }
}
