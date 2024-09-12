public class secondTask {
    public static void main(String[] args) {
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));
    }
    public static int fitCalc (int minutes, int intensity) {
        return minutes * intensity;
    }
}
