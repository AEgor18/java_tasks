public class thirdTask {
    public static void main(String[] args) {
        System.out.println(containers(3,4,2));
        System.out.println(containers(5,0,2));
        System.out.println(containers(4,1,4));
    }
    public static int containers(int box, int bag, int barrel) {
        return box*20 + bag*50 + barrel*100;
    }
}
