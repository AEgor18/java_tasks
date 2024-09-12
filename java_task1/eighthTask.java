public class eighthTask {
    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
    }
    public static int gcd(int a, int b) {
        int gcdValue = 1;
        int c = a<b? a : b;
        for (int i = 1; i < c; i++) {
            if (a%i == 0 && b%i == 0) {
                gcdValue = i;
            }
        } return gcdValue;
    }
}
