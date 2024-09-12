public class tenthTask {
    public static void main(String[] args) {
        System.out.println(tables(5,2));
        System.out.println(tables(31,20));
        System.out.println(tables(123,58));
    }
    public static int tables(int students, int tables) {
        int studentsPerTable = tables*2;
        if (students - studentsPerTable < 0) {
            return 0;
        } else {
            return students%2 == 0 ? ((students - studentsPerTable)/2) : ((students - studentsPerTable)/2)+1;
        }
    }
}
