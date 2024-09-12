public class firstTask {
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
    }
    public static double convert(int gallons) {
        double literValue = 3.785;
        return gallons*literValue;
    }
}
