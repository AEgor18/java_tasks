public class ninthTask {
    public static void main(String[] args) {
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
    }
    public static double ticketSaler(int count, int price) {
        double percent = 0.28;
        return count*price-price*percent*count;
    }
}
