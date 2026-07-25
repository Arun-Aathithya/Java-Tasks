public class TaskFN {
    public static void main(String[] args) {
        System.out.println("Pattern Printing");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
        }
            System.out.println();
        }
        System.out.println("Reverse Pattern Printing");
        for(int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
