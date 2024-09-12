public class seventhTask {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
    }
    public static int factorial(int n) {
        int factorialValue = 1;
        while (n > 0) {
            factorialValue *= n;
            n--;
        } return factorialValue;
    }
}
