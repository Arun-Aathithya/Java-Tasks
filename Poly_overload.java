class Calcul {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Poly_overload{
    public static void main(String[] args) {
        Calcul c = new Calcul();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.5, 20.5));
        System.out.println(c.add(10, 20, 30));
    }
}