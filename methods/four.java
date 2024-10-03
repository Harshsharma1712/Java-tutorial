package methods;

public class four {

    static int plusMethd(int x, int y) {
        return x + y;
    }

    static double plusMethd(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        // Method Overloading..
        System.out.println(plusMethd(7, 4));
        System.out.println(plusMethd(7.5, 4.9));

    }
}
