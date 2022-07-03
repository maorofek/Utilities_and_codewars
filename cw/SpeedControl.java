public class SpeedControl {

    public static void main(String[] args) {
        System.out.println(gps(20, new double[]{0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61}));//41
        System.out.println(gps(12, new double[]{0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25}));//219
        System.out.println(gps(20, new double[]{0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84}));//80

    }

    // x=vt   0.19 = 15*v
    public static int gps(int s, double[] x) {
        double max = 0;
        for (int i = 0; i < x.length - 1; i++) {
            max = Math.max(max, 3600 * (x[i + 1] - x[i]) / s);
        }
        return (int) max;
    }
}