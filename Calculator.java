import java.util.Scanner;

    public class Calculator {

        int calculate(int a, int b) {
            return a + b;
        }
        double calculate(double a, double b) {
            return a - b;
        }
        long calculate(long a, long b) {
            return a * b;
        }
        float calculate(float a, float b) {
            return a / b;
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Calculator obj = new Calculator();

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter two integers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Addition = " + obj.calculate(a, b));
                    break;

                case 2:
                    System.out.print("Enter two decimal numbers: ");
                    double c = sc.nextDouble();
                    double d = sc.nextDouble();
                    System.out.println("Subtraction = " + obj.calculate(c, d));
                    break;

                case 3:
                    System.out.print("Enter two long numbers: ");
                    long e = sc.nextLong();
                    long f = sc.nextLong();
                    System.out.println("Multiplication = " + obj.calculate(e, f));
                    break;

                case 4:
                    System.out.print("Enter two float numbers: ");
                    float g = sc.nextFloat();
                    float h = sc.nextFloat();

                    if (h != 0) {
                        System.out.println("Division = " + obj.calculate(g, h));
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            sc.close();
        }
    }
