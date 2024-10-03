package methods;

public class third {

    static int myMethod(int x) {
        return 5 + x;
    }

    static double myDoubleMethod(double x, double y) {
        return x*y;
    }

    public static void main(String[] args) {
        
        // System.out.println(myMethod(10));
        double result = myDoubleMethod(5.9, 7.5);
        
        System.out.println(result);

    }
}
