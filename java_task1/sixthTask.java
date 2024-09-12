public class sixthTask {
    public static void main(String[] args) {
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));
    }
    public static int howManyItems (double n, double w, double h) {
        double oneItem = w*h*2;
        int count = 0;
        while (oneItem < n) {
            count++;
            n -= oneItem;
        }
        return count;
    }
}
